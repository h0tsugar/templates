package org.example.abstractFactory.banking;

import org.example.abstractFactory.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write code to Java Developer");
    }
}
