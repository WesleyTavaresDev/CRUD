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

        String name = getProfileName();

        if(isRegistered(name)) {
            
            System.out.println("Name -> " + profileList.get(name).getName());
            System.out.println("Birth date -> " + profileList.get(name).getBirthDate());
            System.out.println("Registration date -> " + profileList.get(name).getRegistrationDate());
            profileList.get(name).setLastModification();
            System.out.println("Last modification -> " + profileList.get(name).getLastModification());
            
            menuController.chooseOption();
        }

        else {
            System.out.printf("\nERROR -> There's no %s recorded\n", name);
            menuController.chooseOption();
        }
    }

    public void update(MenuController menuController) {
        
    }

    public void delete(MenuController menuController) {
        
    }


    private String getProfileName() {

        System.out.print("Please, enter profile name -> ");
        
        String name = sc.nextLine();
        return name;
    }
    
    private boolean isRegistered(String name) {
        return profileList.containsKey(name);
    }
}
