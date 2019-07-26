package com.ushalab.java;

public class CustomerX {
    private String name;
    private String email;
    private String company;

    public CustomerX(String name, String email, String company) {
        this.setName(name);
        this.setEmail(email);
        this.setCompany(company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
