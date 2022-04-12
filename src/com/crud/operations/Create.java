package com.crud.operations;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.controller.*;
import com.crud.profile.Profile;

public class Create {

    Scanner sc = new Scanner(System.in);
    
    public void create(MenuController menuController, HashMap<String, Profile> profileList) {
        
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
}
