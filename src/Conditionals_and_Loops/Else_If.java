package Conditionals_and_Loops;

import java.util.Scanner;

public class Else_If {
    public static void main(String[]args){
        Scanner age_input = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = age_input.nextInt();
         if(age <= 0){
             System.out.println("Error !!!");
         } else if (age <= 16){
             System.out.println("Kinda Young");
         } else if(age <= 100){
             System.out.println("Welcome!");
         } else{
             System.out.println("Really??");
         }
    }
}
