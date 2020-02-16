//Justin Lazarski
//4/29/19
//Reverse a string
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");

        String userString = "java";
        String reverseString = "";

        userString = userString.toLowerCase();
        System.out.println(userString);

        reverseString = new StringBuilder(userString).reverse().toString();
        System.out.println(reverseString);
    }
}
