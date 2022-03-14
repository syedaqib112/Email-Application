package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courser;
    private String tutionBalance;
    private int costOfCourse = 600;

    // Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.println("1 - Frehsmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = sc.nextInt();
        System.out.println(firstName + " " + lastName + " Gread = " + gradeYear);
    }
    // Generate an ID

    // Enroll in courses

    // View balance

    // Pay tution fee

    // Show status

}
