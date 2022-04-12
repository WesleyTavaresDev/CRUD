package com.crud.operations;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.controller.MenuController;
import com.crud.profile.Profile;

public class Delete {

    Scanner sc = new Scanner(System.in);

    public void delete(MenuController menuController, HashMap<String, Profile> profileList) {

        String name = getProfileName();   
        profileList.remove(name);
        System.out.println(name + " deleted");
        
        menuController.chooseOption();
    }

    private String getProfileName() {
        System.out.print("Please, enter profile name -> ");
        
        String name = sc.nextLine();
        return name;
    }
}
