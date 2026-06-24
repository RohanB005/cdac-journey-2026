package com.app.stud;

public class Student {

    private int studId;
    private String name;
    private double m1;
    private double m2;
    private double m3;

    public Student(int studId, String name, double m1, double m2, double m3) {
        this.studId = studId;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void display() {
        System.out.println("Student Details");
        System.out.println("--------------------");
        System.out.println("Student Id : " + studId);
        System.out.println("Name       : " + name);
        System.out.println("M1         : " + m1);
        System.out.println("M2         : " + m2);
        System.out.println("M3         : " + m3);
    }
}