package com.uyghurschool.learnjava.classtutorial;

public class TestSuiteConstructorDemo {

    private String projectName;
    private int projectId;
    private int testSuiteId;
    private String testSuiteName;
    private String testSuiteDescription;
    //default constructor - no argument
    public TestSuiteConstructorDemo() {
    }

    public TestSuiteConstructorDemo(String projectName, int projectId) {
        this.projectName = projectName;
        this.projectId = projectId;
    }

    public TestSuiteConstructorDemo(String projectName, int projectId,int testSuiteId) {
        this.projectName = projectName;
        this.projectId = projectId;
        this.testSuiteId = testSuiteId;
    }

    public TestSuiteConstructorDemo(String projectName, int projectId, int testSuiteId,
                                    String testSuiteName, String testSuiteDescription) {
        this.projectName = projectName;
        this.projectId = projectId;
        this.testSuiteId = testSuiteId;
        this.testSuiteName = testSuiteName;
        this.testSuiteDescription = testSuiteDescription;
    }

    public static void main(String[] args) {
        TestSuiteConstructorDemo demo1=new TestSuiteConstructorDemo();
        demo1.setProjectName("Uyghur School Java");
        demo1.setProjectId(1001);
        demo1.setTestSuiteName("Java Program test");
        demo1.setTestSuiteId(1001);
        demo1.setTestSuiteDescription("We test the application using Java Code");
        System.out.println(demo1.toString());

        TestSuiteConstructorDemo demo2=new TestSuiteConstructorDemo("Project 1", 1002,1002);
        System.out.println(demo2.toString());
        TestSuiteConstructorDemo demo3=new TestSuiteConstructorDemo("Project 3",1003,1003,
                "Project 3 Test Suite","Project 3 Test Description");
        System.out.println(demo3.toString());

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(int testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public String getTestSuiteName() {
        return testSuiteName;
    }

    public void setTestSuiteName(String testSuiteName) {
        this.testSuiteName = testSuiteName;
    }

    public String getTestSuiteDescription() {
        return testSuiteDescription;
    }

    public void setTestSuiteDescription(String testSuiteDescription) {
        this.testSuiteDescription = testSuiteDescription;
    }

    @Override
    public String toString() {
        return "TestSuiteConstructorDemo{" +
                "projectName='" + projectName + '\'' +
                ", projectId=" + projectId +
                ", testSuiteId=" + testSuiteId +
                ", testSuiteName='" + testSuiteName + '\'' +
                ", testSuiteDescription='" + testSuiteDescription + '\'' +
                '}';
    }
}
