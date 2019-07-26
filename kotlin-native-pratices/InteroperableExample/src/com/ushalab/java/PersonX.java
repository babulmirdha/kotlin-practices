package com.ushalab.java;

public class PersonX {
    private String firstName;
    private String lastName;

    public PersonX(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
    }

    public String getFullName(){
        return firstName+lastName;
    }

}
