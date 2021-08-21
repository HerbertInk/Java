package Conditionals_and_Loops;

import java.util.Scanner;
import java.lang.String;

public class statements {
    public static void main(String[]args){
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        String firstname, lastname;
            System.out.println("First Name: "); firstname = name.nextLine();
            System.out.println("Last Name: ");  lastname = name.nextLine();
            System.out.println("Enter Age: "); int x = age.nextInt(); /*x == Age */
        if (x <= 16){
            System.out.println("Below age, Ohhh...yea..You 'Must' be 17+");
        }else{
            System.out.println("Welcome "+ lastname+ "!");
        }
    }
}
/*Your code goes here. if  comparison operators
<, >, != not equal to, == equal to, <=, >=, || or.*/