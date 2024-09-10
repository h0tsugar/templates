package org.example.prototype;

public class App {
    public static void main(String[] args) {
        Project master = new Project(1, "super project", "java; \n");
        System.out.println(master);

        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        ProjectFactory factory = new ProjectFactory(master);
        Project projectPrototypeClone = factory.cloneProject();
        System.out.println(projectPrototypeClone);
    }
}
