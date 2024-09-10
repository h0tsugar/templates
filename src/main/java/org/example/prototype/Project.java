package org.example.prototype;

public class Project implements Copyable {
    private int id;
    private String projectName;
    private String sourceCode;

    @Override
    public Object copy() {
        return new Project(id, projectName, sourceCode);
    }

    public Project(int id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

//    @Override
//    public String toString() {
//        return "Project{" +
//                "id=" + id +
//                ", projectName='" + projectName + '\'' +
//                ", sourceCode='" + sourceCode + '\'' +
//                '}';
//    }
}

