package com.crud.profile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Profile {

    private String name;
    private String telephone;

    private String birthDate;

    private LocalDate registrationDate;
    private LocalDate lastModification;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }


    public LocalDate getLastModification() {
        return this.lastModification;
    }

    public void setLastModification() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    
        lastModification = LocalDate.now();

        dateTimeFormatter.format(lastModification);
    }
    
    public void setRegistrationDate() {
        registrationDate = LocalDate.now();
    }
}