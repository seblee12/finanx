package com.finanx.main;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();
        Interface interface1 = new Interface();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Thank you for using Finanx created by Clearance Adriana and his psychotic friend");

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("Initializing");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
        }

        System.out.println("\n\nPlease select from the following options:");
        System.out.println("1. Client Login");
        System.out.println("2. Become a client");
        System.out.println("3. Delete account");
        System.out.println("4. Setting");
        System.out.println("5. Career");
        System.out.println("6. Contact");

        String option = scanner.nextLine();

        int result = Integer.parseInt(option);


        switch (result) {
            case 1:
                break;
            case 2:
                if (interface1.addClient()) {
                    System.out.println("Congratulation!, We welcome you to Finanx!");
                } else {
                    System.out.println("Registration failed. Please contact our support line 911");
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;

        }


    }
}
