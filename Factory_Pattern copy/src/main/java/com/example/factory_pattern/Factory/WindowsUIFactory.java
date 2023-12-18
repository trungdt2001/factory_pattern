package com.example.factory_pattern.Factory;

import com.example.factory_pattern.Entity.Button;
import com.example.factory_pattern.Entity.DropDownMenu;
import com.example.factory_pattern.Entity.TextBox;
import com.example.factory_pattern.Entity.UIComponent;

public class WindowsUIFactory implements UIFactory{
    @Override
    public void viewUI(String type) {
        UIComponent UI;
        if(type.equalsIgnoreCase("button")){
            UI = new Button();
            UI.view("window");
        }
        else if(type.equalsIgnoreCase("textbox")){
            UI = new TextBox();
            UI.view("window");
        }
        else if(type.equalsIgnoreCase("dropdownmenu")){
            UI = new DropDownMenu();
            UI.view("window");
        }
    }
}
