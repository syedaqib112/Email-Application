package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private static int costOfCourse = 600;
    private static int id = 1000;
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tutionBalance = 0;
    ;


    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.println("1 - Frehsmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = sc.nextInt();

        setStudentID();
//        System.out.println(firstName + " " + lastName + " Grade: " + gradeYear + " ID: " + studentID);
    }

    // Generate an ID
    private void setStudentID() {
        // Grade + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tutionBalance += costOfCourse;
            } else {
                break;
            }
        }
        while (1 != 0);
//        System.out.println("ENROLLED IN: \n"+courses);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tutionBalance);
    }

    // Pay tution fee
    public void payTuition() {
        viewBalance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        int payment = sc.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tutionBalance;
    }
}
