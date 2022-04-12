package com.crud.operations;

import java.util.HashMap;
import java.util.Scanner;

import com.crud.controller.*;
import com.crud.profile.Profile;

public class Delete {

    Scanner sc = new Scanner(System.in);

    public void delete(MenuController menuController, HashMap<String, Profile> profileList) {

        String profileName = ProfileController.getProfileName();   
        profileList.remove(profileName);
        System.out.println(profileName + " deleted");
        
        menuController.chooseOption();
    }
}
