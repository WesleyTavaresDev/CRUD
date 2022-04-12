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
            
        profile.showProfilesList();
        switch(sc.next().toLowerCase()) {
            case "create" ->  profile.create(this);
            
            case "read" -> {
                //profile.showProfilesList();
                profile.read(this); }
            
            case "update" -> { 
                //profile.showProfilesList(); 
                profile.update(this);}

            case "delete" -> { 
                //profile.showProfilesList();
                    profile.delete(this);}
        
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

}