package org.example.factoryMethod.factoryImpl;

import org.example.factoryMethod.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
