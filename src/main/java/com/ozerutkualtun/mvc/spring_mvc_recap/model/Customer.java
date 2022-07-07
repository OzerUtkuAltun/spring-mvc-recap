package com.ozerutkualtun.mvc.spring_mvc_recap.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotNull(message = "This field is required!")
    @Size(min = 1, message = "this field is required") // şu anda whitespace karakterlerini de okuyor. Ve validasyondan geçiyor. Çözmek için @initbinder kullanılacak. Not: initbinder ilgili controller'a gelen her requestten önce tetiklenir.
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
