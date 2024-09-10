package org.example.prototype;

public class ProjectFactory {
    Project project;

    Project cloneProject() {
        return (Project) project.copy();
    }

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
