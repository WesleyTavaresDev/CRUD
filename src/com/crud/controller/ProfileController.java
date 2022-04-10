package com.crud.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.operations.IOperations;
import com.crud.profile.Profile;

public class ProfileController implements IOperations{

    Scanner sc = new Scanner(System.in);
    HashMap<String, Profile> profileList = new HashMap<>();
    
    public void create(MenuController menuController) {
        
        Profile newProfile = new Profile();

        System.out.print("Profile name -> " );
        newProfile.setName(sc.nextLine());

        System.out.print("\nProfile birth date -> ");
        newProfile.setBirthDate(sc.nextLine());

        newProfile.setRegistrationDate();
        profileList.put(newProfile.getName(), newProfile);

        System.out.println("Profile creation completed");

        menuController.chooseOption();
    }
  
    public void read(MenuController menuController) {
        
    }

    public void update(MenuController menuController) {
        
    }

    public void delete(MenuController menuController) {
        
    }
}
