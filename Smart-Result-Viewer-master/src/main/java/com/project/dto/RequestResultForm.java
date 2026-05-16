package com.project.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;




public class RequestResultForm {
    @NotBlank(message = "Enter rollnumber !!")
    private String rollNumber;
    //    @NotBlank(message = "Select Date of Birth !!")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public RequestResultForm(String rollNumber, LocalDate dateOfBirth) {
        this.rollNumber = rollNumber;
        this.dateOfBirth = dateOfBirth;
    }
    public RequestResultForm()
    {

    }
}