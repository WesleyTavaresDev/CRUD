package com.crud.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.operations.*;
import com.crud.profile.Profile;

public class ProfileController implements IOperations{

    Scanner sc = new Scanner(System.in);
    HashMap<String, Profile> profileList = new HashMap<>();
    
    Create create = new Create();
    Read read = new Read();
    Update update = new Update();

    public void onCreate(MenuController menuController) {
        create.create(menuController, profileList);
    }

    public void onRead(MenuController menuController) {
        read.read(menuController, profileList);    
    }

    public void onUpdate(MenuController menuController) {
        update.update(menuController, profileList);
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
}

