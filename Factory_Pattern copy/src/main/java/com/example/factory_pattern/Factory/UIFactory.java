package com.example.factory_pattern.Factory;

public interface UIFactory {

    default void viewUI(String type) {
        UIFactory UI;
        if (type.equalsIgnoreCase("window")) {
            UI = new WindowsUIFactory();
            UI.viewUI("button");
            UI.viewUI("textbox");
            UI.viewUI("dropdownmenu");
        } else if (type.equalsIgnoreCase("mac")) {
            UI = new MacUIFactory();
            UI.viewUI("button");
            UI.viewUI("textbox");
            UI.viewUI("dropdownmenu");
        } else if (type.equalsIgnoreCase("linux")) {
            UI = new LinuxUIFactory();
            UI.viewUI("button");
            UI.viewUI("textbox");
            UI.viewUI("dropdownmenu");
        }
    }
}
