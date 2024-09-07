package org.example.abstractFactory.website;

import org.example.abstractFactory.factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Test code");
    }
}
