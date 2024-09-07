package org.example.abstractFactory.website;

import org.example.abstractFactory.factory.Developer;
import org.example.abstractFactory.factory.ProjectManager;
import org.example.abstractFactory.factory.ProjectTeamFactory;
import org.example.abstractFactory.factory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
