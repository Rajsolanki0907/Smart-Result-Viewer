package com.project.controller;


import com.project.dto.StudentForm;
import com.project.entites.Marks;
import com.project.entites.Students;
import com.project.repositories.StudentRepo;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.error.Mark;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private StudentRepo studentRepo;
    private ModelMapper modelMapper;

    public AdminController(StudentRepo studentRepo, ModelMapper modelMapper) {
        this.studentRepo = studentRepo;
        this.modelMapper = modelMapper;
    }


    @PostMapping("/result-page")
    public String redirectHandler() {
        return "redirect:/admin/add-result";
    }

    @GetMapping("/add-result")
    public String addResultForm(Principal principal, Model model) {

        String name = principal.getName();
        System.out.println(name);

        StudentForm studentForm = new StudentForm();

        List<String> standardOptions = new ArrayList<>();
        standardOptions.add("CLASS 1");
        standardOptions.add("CLASS 2");
        standardOptions.add("CLASS 3");
        standardOptions.add("CLASS 4");
        standardOptions.add("CLASS 5");
        standardOptions.add("CLASS 6");


        model.addAttribute("studentForm", studentForm);
        model.addAttribute("standardOptions", standardOptions);
        model.addAttribute("name", name);
        return "admin/add_result";
    }

    @RequestMapping(value = "/add-result-action", method = RequestMethod.POST)
    public String processAddResultForm(
            @Valid @ModelAttribute StudentForm studentForm,
            BindingResult bindingResult,
            Model model
    ) {


        if (bindingResult.hasErrors()) {
            List<String> standardOptions = new ArrayList<>();
            standardOptions.add("CLASS 1");
            standardOptions.add("CLASS 2");
            standardOptions.add("CLASS 3");
            standardOptions.add("CLASS 4");
            standardOptions.add("CLASS 5");
            standardOptions.add("CLASS 6");
            model.addAttribute("standardOptions", standardOptions);
            return "admin/add_result";
        }


//        convert student form to student entity

        Students student = modelMapper.map(studentForm, Students.class);

        //har marks to attach student
        List<Marks> updatedList = student.getMarks().stream().map(mark -> {
            mark.setStudent(student);
            return mark;
        }).toList();

        //update student list
        student.setMarks(updatedList);


        student.setId(UUID.randomUUID().toString());
        studentRepo.save(student);
        return "redirect:/admin/add-result?message=Student added successfully ";

    }
}

