package com.crud.profile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile {

    private String name;
    private String telephone;

    private String birthDate;

    private LocalDate registrationDate;
    private LocalDate lastModification;

    public void setLastModification() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    
        lastModification = LocalDate.now();

        dateTimeFormatter.format(lastModification);
    }

    public void setRegistrationDate() {
        registrationDate = LocalDate.now();
    }

    
}