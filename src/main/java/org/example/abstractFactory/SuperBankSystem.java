package org.example.abstractFactory;

import org.example.abstractFactory.banking.BankingTeamFactory;
import org.example.abstractFactory.factory.Developer;
import org.example.abstractFactory.factory.ProjectManager;
import org.example.abstractFactory.factory.ProjectTeamFactory;
import org.example.abstractFactory.factory.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Bank System");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
