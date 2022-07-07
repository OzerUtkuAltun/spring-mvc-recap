package com.ozerutkualtun.mvc.spring_mvc_recap.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotNull(message = "This field is required!")
    @Size(min = 1, message = "this field is required") // şu anda whitespace karakterlerini de okuyor. Ve validasyondan geçiyor. Çözmek için @initbinder kullanılacak. Not: initbinder ilgili controller'a gelen her requestten önce tetiklenir.
    private String lastName;

    @Min(value = 0, message = "Must be greater than or equal to 0")
    @Max(value = 10, message = "Must be less than or equal to 10")
    private Integer freePasses;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
}
