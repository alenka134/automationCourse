package com.automatization.training.inheritance1.targil1;

public class Student extends Person {
    protected String courseName;
    protected boolean switchActive;

    public Student(String name, String email, String courseName, boolean switchActive) {
        super(name, email);
        this.courseName = courseName;
        this.switchActive = switchActive;
        super.name = name;
        super.email = email;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isSwitchActive() {
        return switchActive;
    }

    public void setSwitchActive(boolean switchActive) {
        this.switchActive = switchActive;

        if ( switchActive ==true){
            System.out.println("Student active");
        }
        else {
            System.out.println("Student passive");
        }
    }

    public void printInfo() {
        printInfoPerson();
        setSwitchActive(switchActive);
        System.out.println("Training course is: " + getCourseName() + ". Activity status-->" + switchActive + "\n");
    }
}
