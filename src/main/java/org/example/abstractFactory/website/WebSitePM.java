package org.example.abstractFactory.website;

import org.example.abstractFactory.factory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website Project");
    }
}
