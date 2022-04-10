package com.crud.operations;

import com.crud.controller.MenuController;

public interface IOperations {
    void create(MenuController menuController);
    
    void read(MenuController menuController);
    
    void update(MenuController menuController);

    void delete(MenuController menuController);
}
