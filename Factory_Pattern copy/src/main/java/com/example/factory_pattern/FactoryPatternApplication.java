package com.example.factory_pattern;

import com.example.factory_pattern.Factory.LinuxUIFactory;
import com.example.factory_pattern.Factory.MacUIFactory;
import com.example.factory_pattern.Factory.UIFactory;
import com.example.factory_pattern.Factory.WindowsUIFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryPatternApplication.class, args);

    }
}
