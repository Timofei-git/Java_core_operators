package ru.mentee.power.conditions;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Do you have car licence?(true/false)");
        boolean licence = scanner.nextBoolean();

        String message = (licence && age>=18)?"You can rent a car.":"You can not rent a car.";
        System.out.println(message);

        scanner.close();
    }
}