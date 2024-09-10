package org.example.factoryMethod.factoryImpl;

import org.example.factoryMethod.factory.Developer;
import org.example.factoryMethod.factory.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
