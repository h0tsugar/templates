package org.example.abstractFactory.banking;

import org.example.abstractFactory.factory.Developer;
import org.example.abstractFactory.factory.ProjectManager;
import org.example.abstractFactory.factory.ProjectTeamFactory;
import org.example.abstractFactory.factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
