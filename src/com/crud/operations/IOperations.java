package com.crud.operations;

import com.crud.controller.MenuController;

public interface IOperations {
    void onCreate(MenuController menuController);
    
    void onRead(MenuController menuController);
    
    void onUpdate(MenuController menuController);

    void onDelete(MenuController menuController);
}
