package org.example.factoryMethod.factoryImpl;

import org.example.factoryMethod.factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
