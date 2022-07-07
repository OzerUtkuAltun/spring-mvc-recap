package com.ozerutkualtun.mvc.spring_mvc_recap.model;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "This field is required!")
    @Size(min = 1, message = "this field is required") // şu anda whitespace karakterlerini de okuyor. Ve validasyondan geçiyor. Çözmek için @initbinder kullanılacak. Not: initbinder ilgili controller'a gelen her requestten önce tetiklenir.
    private String lastName;

    @Min(value = 0, message = "Must be greater than or equal to 0")
    @Max(value = 10, message = "Must be less than or equal to 10")
    private Integer freePasses;

    @NotNull(message = "This field is required!")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Postal code has to be 5 chars/digits") // only 5 chars/digits
    private String postalCode;

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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
