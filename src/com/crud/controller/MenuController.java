package com.crud.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.profile.Profile;

public class MenuController {
    
    HashMap<String, Profile> profileList = new HashMap<>();

    ProfileController profile = new ProfileController();

    public static void main(String[] args) {
        MenuController menuController = new MenuController();

        menuController.chooseOption();
    } 

    void chooseOption() {

        showOptions();

        Scanner sc = new Scanner(System.in);
        
        switch(sc.next().toLowerCase()) {
            case "create" ->  profile.create(this);
            
            case "read" -> profile.read(this); 
            
          //  case "update" -> update();

         //   case "delete" -> delete();
        
            default -> {
                System.out.println("This option doesn't exists");
                System.out.println("Repeat");
                chooseOption();
            }
        }
    }

    private void showOptions() {
        System.out.println("------ Menu ------");
        System.out.println("->  Create");
        System.out.println("->  Read");
        System.out.println("->  Update");
        System.out.println("->  Delete");
    }


/*    void update() {

        showProfilesList();

        Scanner sc = new Scanner(System.in);

        String name = getProfileName();

        if(isRegistered(name)) {

            System.out.print("Set a new profile name -> ");
            String newName = sc.nextLine();

            profileList.put(newName, profileList.get(name));

            profileList.get(newName).setName(newName);

            System.out.print("\nSet a new profile birth date -> ");
            profileList.get(newName).setBirthDate(sc.nextLine());
            profileList.remove(name);
            chooseOption();
        }
         
        else {
            System.out.printf("\nERROR -> There's no %s recorded\n", name);
            chooseOption();
        }

    }

    void delete() {

        showProfilesList();

        String name = getProfileName();

        profileList.remove(name);
        System.out.println(name + " deleted");

        chooseOption();
    }*/

    void showProfilesList() {
        System.out.println("------ Profiles ------");
        for(String p : profileList.keySet())
            System.out.println("-> " + profileList.get(p).getName()); 
    }
}