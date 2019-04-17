package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

	    Scanner keyboard = new Scanner(System.in);

	    System.out.print("Enter your initial: ");
	    String firstInitial = keyboard.nextLine();

	    System.out.print("Enter your last name: ");
	    String lastName = keyboard.nextLine();

	    System.out.print("your house number: ");
	    int houseNumber = keyboard.nextInt();
	    keyboard.nextLine();

	    System.out.print("Enter your street name: ");
	    String streetName = keyboard.nextLine();

	    System.out.print("Enter your street type: ");
	    String streetType = keyboard.nextLine();

	    System.out.print("Enter your city name: ");
	    String city = keyboard.nextLine();

	    System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");

	    System.out.println(streetName  + " " + streetType + " " + city);

    }
}
