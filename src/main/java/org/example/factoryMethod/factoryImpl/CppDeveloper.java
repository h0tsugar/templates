package org.example.factoryMethod.factoryImpl;

import org.example.factoryMethod.factory.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code");
    }
}
