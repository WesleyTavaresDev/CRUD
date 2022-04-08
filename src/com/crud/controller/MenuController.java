package com.crud.controller;

import java.util.Scanner;

public class MenuController {
    
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
        
        switch(sc.next()) {
            case "Create" -> create();
            
            case "Read" -> read();
            
            case "update" -> update();

            case "delete" -> delete();
        
            default -> {
                System.out.println("This option doesn't exists");
                chooseOption();
            }
        }

    }

    void create() {
        System.out.println("Creating");
    }

    void read() {
        System.out.println("Reading");
    }

    void update() {
        System.out.println("Updating");
    }
    void delete() {
        System.out.println("Deleting");
    }


    
}