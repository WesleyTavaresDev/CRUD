package com.crud.operations;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.controller.*;
import com.crud.profile.Profile;

public class Read {

    Scanner sc = new Scanner(System.in);
    
    public void read(MenuController menuController, HashMap<String, Profile> profileList) {

        String profileName = ProfileController.getProfileName();

        if(profileList.containsKey(profileName)) {
            System.out.println("Name -> " + profileList.get(profileName).getName());
            System.out.println("Birth date -> " + profileList.get(profileName).getBirthDate());
            System.out.println("Registration date -> " + profileList.get(profileName).getRegistrationDate());
            profileList.get(profileName).setLastModification();
            System.out.println("Last modification -> " + profileList.get(profileName).getLastModification());
        }

        else
            ProfileController.wrongProfile(menuController, profileName);

        menuController.chooseOption();
        
    }
}
