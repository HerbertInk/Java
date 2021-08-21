package Conditionals_and_Loops;

import java.util.Scanner;

public class Nested_If_Statements {
    public static void main(String[]args){
        Scanner age_input = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = age_input.nextInt();// can request for user input
            if (age > 0) {
                if (age > 16) {
                    System.out.println("Welcome!");
                } else {
                    System.out.println("Kinda young");
                }
            }
            else {System.out.println("Error 404");}
    }
}
