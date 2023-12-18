package Factory;

import Entity.Button;
import Entity.DropDownMenu;
import Entity.TextBox;
import Entity.UIComponent;

public class MacUIFactory implements UIFactory{
    @Override
    public void viewUI(String type) {
        UIComponent UI;
        if(type.equalsIgnoreCase("button")){
            UI = new Button();
            UI.view("mac");
        }
        else if(type.equalsIgnoreCase("textbox")){
            UI = new TextBox();
            UI.view("mac");
        }
        else if(type.equalsIgnoreCase("dropdownmenu")){
            UI = new DropDownMenu();
            UI.view("mac");
        }
    }
}
