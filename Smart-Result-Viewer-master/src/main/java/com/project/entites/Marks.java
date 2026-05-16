package com.project.entites;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Entity
@Table(name = "result_marks")
public class Marks
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subjectName;
    private String marks;
    private String maxMarks;
    private String feedback;
    private String grade;

    @ManyToOne
    private  Students student;

    public void setId(Long id) {
        this.id = id;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public void setMaxMarks(String maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Marks(Long id, String subjectName, String marks, String maxMarks, String feedback, String grade, Students student) {
        this.id = id;
        this.subjectName = subjectName;
        this.marks = marks;
        this.maxMarks = maxMarks;
        this.feedback = feedback;
        this.grade = grade;
        this.student = student;
    }
    public Marks()
    {

    }
}