package com.app.stud;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2];

        for (int i = 0; i < 2; i++) {

            System.out.println("Enter Student Id:");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter M1:");
            double m1 = sc.nextDouble();

            System.out.println("Enter M2:");
            double m2 = sc.nextDouble();

            System.out.println("Enter M3:");
            double m3 = sc.nextDouble();

            students[i] = new Student(id, name, m1, m2, m3);
        }

        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}