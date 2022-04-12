package com.crud.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.operations.Create;
import com.crud.operations.IOperations;
import com.crud.operations.Read;
import com.crud.profile.Profile;

public class ProfileController implements IOperations{

    Scanner sc = new Scanner(System.in);
    HashMap<String, Profile> profileList = new HashMap<>();
    
    Create create = new Create();
    Read read = new Read();

    public void onCreate(MenuController menuController) {
        create.create(menuController, profileList);
    }

    public void onRead(MenuController menuController) {
        read.read(menuController, profileList);    
    }

    
    public void update(MenuController menuController) {

        String name = getProfileName();

        if(isRegistered(name)) {
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
    
    public void delete(MenuController menuController) {
        String name = getProfileName();   
        profileList.remove(name);
        System.out.println(name + " deleted");
        
        menuController.chooseOption();
    }
    
    public void showProfilesList() {
        System.out.println("------ Profiles ------");
        for(String p : profileList.keySet())
            System.out.println("-> " + profileList.get(p).getName()); 
    }

    private String getProfileName() {
        System.out.print("Please, enter profile name -> ");
        
        String name = sc.nextLine();
        return name;
    }
    
    private boolean isRegistered(String name) {
        return profileList.containsKey(name);
    }
    
    private void wrongProfile(MenuController menuController, String name) {
        System.out.printf("\nERROR -> There's no %s recorded\n", name);
        menuController.chooseOption();
    }
}

