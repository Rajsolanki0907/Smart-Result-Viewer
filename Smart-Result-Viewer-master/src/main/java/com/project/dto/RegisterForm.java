package com.project.dto;

public class RegisterForm
{
   private String t_name;
   private String t_id;
   private String u_name;
   private String password;

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
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

    public RegisterForm(String t_name, String t_id, String u_name, String password) {
        this.t_name = t_name;
        this.t_id = t_id;
        this.u_name = u_name;
        this.password = password;
    }

    public RegisterForm() {
    }
}
