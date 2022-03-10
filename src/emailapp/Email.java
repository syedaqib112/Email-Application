package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = "google.com";

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department is : " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("The Password is : " + this.password);

        //Combine Elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your Email is : " + email);


    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("DEPT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Dept. Code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1) return "sales";
        else if (depChoice == 2) return "dev";
        else if (depChoice == 3) return "acct";
        else return "";
    }

    private String randomPassword(int number) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWZXYZ123456789!@#$%";
        char[] password = new char[number];
        for (int i = 0; i < number; i++) {
            int randInt = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randInt);
        }
        return new String(password);
    }
}