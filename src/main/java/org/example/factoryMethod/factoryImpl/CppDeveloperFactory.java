package org.example.factoryMethod.factoryImpl;

import org.example.factoryMethod.factory.Developer;
import org.example.factoryMethod.factory.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
