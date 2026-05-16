package com.project.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Builder
public class StudentForm {
    @NotBlank(message = "Name is  required !!")
    private String name;
    @NotBlank(message = "Roll Number is  required !!")
    private String rollNumber;
    @NotBlank(message = "Email is required!")
    @Email(message = "Invalid Email !!")
    private String email;
    @NotBlank(message = "Address is required !!")
    private String address;
    @NotBlank(message = "School is required !!")
    private String schoolName;
    private String photoName;
    //    @NotBlank(message = "Dob is required !!")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @NotBlank(message = "Standard is required !!")
    private String standard;
    @NotBlank(message = "FatherName is required !!")
    private String fatherName;
    @NotBlank(message = "Gender is required !!")
    private String gender;

    private List<MarksForm> marks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<MarksForm> getMarks() {
        return marks;
    }

    public void setMarks(List<MarksForm> marks) {
        this.marks = marks;
    }

    public StudentForm(String name, String rollNumber, String email, String address, String schoolName, String photoName, LocalDate dateOfBirth, String standard, String fatherName, String gender, List<MarksForm> marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
        this.address = address;
        this.schoolName = schoolName;
        this.photoName = photoName;
        this.dateOfBirth = dateOfBirth;
        this.standard = standard;
        this.fatherName = fatherName;
        this.gender = gender;
        this.marks = marks;
    }

    public StudentForm() {
    }
}
