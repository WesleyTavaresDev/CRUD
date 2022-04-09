package com.crud.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.profile.Profile;

public class MenuController {
    
    HashMap<String, Profile> profileList = new HashMap<>();

    public static void main(String[] args) {
        MenuController menuController = new MenuController();

        menuController.chooseOption();
    } 

    void chooseOption() {

        System.out.println("------ Menu ------");
        System.out.println("->  Create");
        System.out.println("->  Read");
        System.out.println("->  Update");
        System.out.println("->  Delete");

        Scanner sc = new Scanner(System.in);
        

        switch(sc.next().toLowerCase()) {
            case "create" ->  create();
            
            case "read" -> read(); 
            
            case "update" -> update();

            case "delete" -> delete();
        
            default -> {
                System.out.println("This option doesn't exists");
                System.out.println("Repeat");
                chooseOption();
            }
        }
    }

    void create() {

        Scanner sc = new Scanner(System.in);

        Profile newProfile = new Profile();

        System.out.print("Profile name -> " );
        newProfile.setName(sc.nextLine());

        System.out.print("\nProfile age -> ");
        newProfile.setAge(sc.nextInt());

        profileList.put(newProfile.getName(), newProfile);

        System.out.println("Profile creation completed");

        chooseOption();
    }

    void read() {

        showProfilesList();


        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter profile name -> ");
        
        String name = sc.nextLine();

        if(profileList.containsKey(name)) {
            System.out.println("Name -> " + profileList.get(name).getName());
            System.out.println("Age -> "+ profileList.get(name).getAge());

            chooseOption();
        }

        else {
            System.out.printf("\nERROR -> There's no %s recorded\n", name);
            chooseOption();
        }
    }

    void update() {

        showProfilesList();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter profile name -> ");
        
        String name = sc.nextLine();

        if(profileList.containsKey(name)) {
            System.out.print("Set a new profile name -> ");
            String newName = sc.nextLine();

            profileList.put(newName, profileList.get(name));

            profileList.get(newName).setName(newName);
            


            System.out.print("\nSet a new profile Age -> ");
            profileList.get(newName).setAge(sc.nextInt());

            chooseOption();
        }
         
        else {
            System.out.printf("\nERROR -> There's no %s recorded\n", name);
            chooseOption();
        }

    }

    void delete() {

        showProfilesList();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter profile name -> ");
        
        String name = sc.nextLine();

        profileList.remove(name);
        System.out.println(name + " deleted");

        chooseOption();
    }

    void showProfilesList() {
        System.out.println("------ Profiles ------");
        for(String p : profileList.keySet())
            System.out.println("-> " + profileList.get(p).getName()); 
    }
}