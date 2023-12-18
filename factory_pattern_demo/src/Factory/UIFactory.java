package Factory;

import Entity.Button;
import Entity.DropDownMenu;
import Entity.TextBox;
import Entity.UIComponent;

public interface UIFactory {

//    default void viewUI(String type) {
//        UIFactory UI;
//        if (type.equalsIgnoreCase("window")) {
//            UI = new WindowsUIFactory();
//            UI.viewUI("button");
//            UI.viewUI("textbox");
//            UI.viewUI("dropdownmenu");
//        } else if (type.equalsIgnoreCase("mac")) {
//            UI = new MacUIFactory();
//            UI.viewUI("button");
//            UI.viewUI("textbox");
//            UI.viewUI("dropdownmenu");
//        } else if (type.equalsIgnoreCase("linux")) {
//            UI = new LinuxUIFactory();
//            UI.viewUI("button");
//            UI.viewUI("textbox");
//            UI.viewUI("dropdownmenu");
//        }
//}

    default void viewUI(String type) {
        UIComponent UI;
        if (type.equalsIgnoreCase("window")) {
            UI = new Button();
            UI.view("window");
            UI = new DropDownMenu();
            UI.view("dropdown");
            UI = new TextBox();
            UI.view("textbox");
        } else if (type.equalsIgnoreCase("mac")) {
            UI = new Button();
            UI.view("window");
            UI = new DropDownMenu();
            UI.view("dropdown");
            UI = new TextBox();
            UI.view("textbox");
        } else if (type.equalsIgnoreCase("linux")) {
            UI = new Button();
            UI.view("window");
            UI = new DropDownMenu();
            UI.view("dropdown");
            UI = new TextBox();
            UI.view("textbox");
        }
    }
}

