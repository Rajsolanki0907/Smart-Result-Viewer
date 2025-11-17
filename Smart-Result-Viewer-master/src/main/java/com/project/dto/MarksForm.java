package com.project.dto;

import lombok.*;


@NoArgsConstructor
@Builder
public class MarksForm {
    private String subjectName;
    private String marks;
    private String maxMarks;
    private String feedback;
    private String grade;

    private StudentForm student;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(String maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public StudentForm getStudent() {
        return student;
    }

    public void setStudent(StudentForm student) {
        this.student = student;
    }

    public MarksForm(String subjectName, String marks, String maxMarks, String feedback, String grade, StudentForm student) {
        this.subjectName = subjectName;
        this.marks = marks;
        this.maxMarks = maxMarks;
        this.feedback = feedback;
        this.grade = grade;
        this.student = student;
    }
    public MarksForm()
    {

    }
}
