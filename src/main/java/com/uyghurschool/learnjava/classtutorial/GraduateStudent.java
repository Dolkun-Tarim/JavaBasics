package com.uyghurschool.learnjava.classtutorial;

public class GraduateStudent extends Student {
    private String researchField;
    private String advisorName;

    public GraduateStudent() {
        super();
    }

    public GraduateStudent(String firstName, String lastName, String middleInitial, String className, String major,
                           String gender, String researchField, String advisorName) {
        super(firstName, lastName, middleInitial, className, major, gender);
        this.researchField = researchField;
        this.advisorName = advisorName;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    @Override
    public String toString() {
        return "GraduateStudent{\n" +
                "firstName="+super.getFirstName()+"\n"+
                "Middle Initial="+super.getMiddleInitial()+"\n"+
                "lastName="+super.getLastName()+"\n"+
                "class="+super.getClassName()+"\n"+
                "Major="+super.getMajor()+"\n"+
                "Gender="+super.getGender()+"\n"+
                "researchField='" + researchField + "\n"+
                "advisorName='" + advisorName + "}";
    }
}
