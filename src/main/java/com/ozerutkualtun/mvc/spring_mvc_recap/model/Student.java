package com.ozerutkualtun.mvc.spring_mvc_recap.model;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    private LinkedHashMap<String, String> optionsForCountry;

    private LinkedHashMap<String, String> optionsForFavoriteLanguage;

    public Student(){
        this.optionsForCountry = new LinkedHashMap<>();
        optionsForCountry.put("TR", "Turkey");
        optionsForCountry.put("FR", "France");
        optionsForCountry.put("UK", "England");

        this.optionsForFavoriteLanguage = new LinkedHashMap<>();
        optionsForFavoriteLanguage.put("Java", "Java");
        optionsForFavoriteLanguage.put("Py3", "Python");
        optionsForFavoriteLanguage.put("Ruby", "Ruby");
        optionsForFavoriteLanguage.put("JS", "JavaScript");

    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getOptionsForCountry() {
        return optionsForCountry;
    }

    public LinkedHashMap<String, String> getOptionsForFavoriteLanguage() {
        return optionsForFavoriteLanguage;
    }
}
