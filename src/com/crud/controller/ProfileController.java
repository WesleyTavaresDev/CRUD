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
    Delete delete = new Delete();

    public void onCreate(MenuController menuController) {
        create.create(menuController, profileList);
    }

    public void onRead(MenuController menuController) {
        read.read(menuController, profileList);    
    }

    public void onUpdate(MenuController menuController) {
        update.update(menuController, profileList);
    }
    
    public void onDelete(MenuController menuController) {
        delete.delete(menuController, profileList);
    }
    
    public void showProfilesList() {
        System.out.println("------ Profiles ------");
        for(String p : profileList.keySet())
            System.out.println("-> " + profileList.get(p).getName()); 
    }


    public static String getProfileName() {
        System.out.print("Please, enter profile name -> ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        sc.close();
        return name;
    }

    public static void wrongProfile(MenuController menuController, String name) {
        System.out.printf("\nERROR -> There's no %s recorded\n", name);
    }
}

