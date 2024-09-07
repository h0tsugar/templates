package org.example.abstractFactory.website;

import org.example.abstractFactory.factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer write code");
    }
}
