package org.example.factoryMethod;

import org.example.factoryMethod.factory.Developer;
import org.example.factoryMethod.factory.DeveloperFactory;
import org.example.factoryMethod.factoryImpl.CppDeveloperFactory;
import org.example.factoryMethod.factoryImpl.JavaDeveloperFactory;
import org.example.factoryMethod.factoryImpl.PhpDeveloperFactory;

class App {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is not supported");
        }
    }
}

