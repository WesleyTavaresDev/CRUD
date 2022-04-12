package com.crud.operations;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.controller.*;
import com.crud.profile.Profile;

public class Update {

    Scanner sc = new Scanner(System.in);

    public void update(MenuController menuController, HashMap<String, Profile> profileList) {

        String profileName = ProfileController.getProfileName();

        if(profileList.containsKey(profileName)) {

            System.out.print("Set a new profile name -> ");
            String newProfileName = sc.nextLine();

            profileList.put(newProfileName, profileList.get(profileName));
            profileList.get(newProfileName).setName(newProfileName);

            System.out.print("\nSet a new profile birth date -> ");
            profileList.get(newProfileName).setBirthDate(sc.nextLine());
            profileList.remove(profileName);
        }
        
        else 
            ProfileController.wrongProfile(menuController, profileName);       
        menuController.chooseOption();
    }

}
