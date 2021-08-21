package Conditionals_and_Loops;

import java.util.Scanner;
import java.lang.String;

public class Logical_Statements {
    public static void main(String[]args){
        Scanner age_input = new Scanner(System.in);
        Scanner money_input = new Scanner(System.in);
            System.out.println("Age: ");    int age = age_input.nextInt();
            System.out.println("Money: ");    float money = money_input.nextFloat();
                                        /*  Logical statements    */ // && and operator
        if (age > 17 && money > 2000){
            System.out.println("Welcome!");
        }else {System.out.println("Invalid inputs");}
                                        /*  || or operator    The condition becomes true
                                        if one of the operands operates to true*/
        if(age > 17 || money > 2000){
            System.out.println("Welcome! ||");
        }else {System.out.println("Invalid ||");}
                                        /*  Not(!) Is to reverse the logical state
                                        If true the ! will make it false   */
                                        /*    Not(!) &&    */
        if (!(age > 18) && money > 2000 ){       /*  age > 18; Reverted :0<=18 True     You be young?  */
                                                /*  age < 18; welcome?    */
            System.out.println("You be young!!!");
        }else {
            System.out.println("Welcome  !!!");
        }
/*    Not(!) ||    */
        if (!(age > 18) || money > 2000 ){       /*  age > 18; Reverted :0<=18 True     You be young?  */
                                                /*  if input age < 18; welcome?    */
            System.out.println("You be young! !");
        }else {
            System.out.println("Welcome !!!");      /*  No print if any of the conditions is satisfied    */
        }
    }
}

                    /*
                        Basically Not(!), >>>   Like when
                        !(a>b) = a<b    !(a<b) = a>b
                   NOTE:    When "!(a>b)"   is satisfied,                   @Truth_table1101
                        The condition goes True
                        else False

                        ~Ink
                    */