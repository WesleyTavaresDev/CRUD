package com.crud.operations;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.controller.MenuController;
import com.crud.profile.Profile;

public class Read {

    Scanner sc = new Scanner(System.in);
    
    public void read(MenuController menuController, HashMap<String, Profile> profileList) {

        String name = getProfileName();

        if(profileList.containsKey(name)) {
            System.out.println("Name -> " + profileList.get(name).getName());
            System.out.println("Birth date -> " + profileList.get(name).getBirthDate());
            System.out.println("Registration date -> " + profileList.get(name).getRegistrationDate());
            profileList.get(name).setLastModification();
            System.out.println("Last modification -> " + profileList.get(name).getLastModification());
        }

        else
            wrongProfile(menuController, name);

        menuController.chooseOption();
        
    }

    private String getProfileName() {
        System.out.print("Please, enter profile name -> ");
        
        String name = sc.nextLine();
        return name;
    }

    private void wrongProfile(MenuController menuController, String name) {
        System.out.printf("\nERROR -> There's no %s recorded\n", name);
        menuController.chooseOption();
    }
}
