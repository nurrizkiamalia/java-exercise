package com.adepuu.exercises.session10;

import src.main.java.com.adepuu.exercises.session10.borrowProcess;
import src.main.java.com.adepuu.exercises.session10.user;

import java.util.Scanner;

public class LibraryManagement {
    /**
     * Acceptance Criteria:
     * - Each material should have an availability count, and the program should check if the material is still available for borrowing.
     * - The program should demonstrate polymorphism by allowing operations (borrow, return) to be performed on any type of library material through a single method.
     * - The program should include methods to borrow and return materials.
     * - The program should keep track of the available and borrowed materials.
     * - The program should print out the status of materials (available, borrowed) and the actions performed (borrow, return).
     *
     * Notes:
     * - The program doesn't require a menu system; focus should be on Object-Oriented Programming (OOP) and inheritance implementation.
     * - Make sure to implement Inheritance and Polymorphism properly
     */
    public static void main(String[] args) {
        user User = new user();
        borrowProcess borrowing = new borrowProcess();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to college library.");

        System.out.println("Do you want to borrow something?(y/n to continue)");
        String answer;
        answer = input.next();

        if (answer.equals("y")){
            System.out.println("Book lending system");
            User.inputBorrowingSys(input);
            borrowing.bookReturn(input);
        } else{
            System.out.println("You are out.");
            System.exit(0);
        }
    }
}
