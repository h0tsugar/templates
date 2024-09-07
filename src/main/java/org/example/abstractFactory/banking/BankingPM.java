package org.example.abstractFactory.banking;

import org.example.abstractFactory.factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manageProject");
    }
}
