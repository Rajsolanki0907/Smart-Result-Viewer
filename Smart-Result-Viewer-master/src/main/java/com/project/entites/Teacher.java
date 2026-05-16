package com.project.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="teacher_register")
public class Teacher
{
    @Id
    public String t_id;
    public String name;
    public String u_name;
    public String password;

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Teacher(String t_id, String name, String u_name, String password) {
        this.t_id = t_id;
        this.name = name;
        this.u_name = u_name;
        this.password = password;
    }

    public Teacher() {
    }
}
