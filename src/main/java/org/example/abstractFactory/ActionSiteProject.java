package org.example.abstractFactory;

import org.example.abstractFactory.factory.Developer;
import org.example.abstractFactory.factory.ProjectManager;
import org.example.abstractFactory.factory.ProjectTeamFactory;
import org.example.abstractFactory.factory.Tester;
import org.example.abstractFactory.website.WebSiteTeamFactory;

public class ActionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
