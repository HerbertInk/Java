package SoloLearn_Java_Basics;

import java.util.Scanner;

public class Time_convertor {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter days: "); int days = input.nextInt();
        /*days to hours*/int hours = days * 24;
        /*to minutes then s*/float seconds = hours * 60 * 60;
        /*print*/System.out.println(days +" " + "day(s) has/have" + " " + seconds + " "+ "Seconds.");
    }
}
