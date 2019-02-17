package com.uyghurschool.learnjava.classtutorial;

public class StudentObject {
    /*
    @Param firstName - student first name
    @Param lastName - student last name
    @Param middleInitial - student middle Initial
    @Param className - student class name
    @Param major - student major
    @Param gender - student gender
     */
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String className;
    private String major;
    private String gender;

    //constructor
    //default constructor
    public StudentObject() {
    }

    public StudentObject(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentObject(String firstName, String lastName, String middleInitial, String className, String major, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.className = className;
        this.major = major;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentObject{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", className='" + className + '\'' +
                ", major='" + major + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
