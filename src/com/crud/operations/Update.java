package com.crud.operations;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.controller.MenuController;
import com.crud.profile.Profile;

public class Update {

    Scanner sc = new Scanner(System.in);

    public void update(MenuController menuController, HashMap<String, Profile> profileList) {

        String name = getProfileName();

        if(profileList.containsKey(name)) {

            System.out.print("Set a new profile name -> ");
            String newName = sc.nextLine();

            profileList.put(newName, profileList.get(name));
            profileList.get(newName).setName(newName);

            System.out.print("\nSet a new profile birth date -> ");
            profileList.get(newName).setBirthDate(sc.nextLine());
            profileList.remove(name);
            menuController.chooseOption();
        }
        
        else 
        wrongProfile(menuController, name);
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
