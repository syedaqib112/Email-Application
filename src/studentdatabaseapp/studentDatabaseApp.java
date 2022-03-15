package studentdatabaseapp;

import java.util.Scanner;

public class studentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many students we want to add
        System.out.println("Enter number of students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
}
