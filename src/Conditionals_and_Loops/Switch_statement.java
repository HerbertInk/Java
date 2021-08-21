package Conditionals_and_Loops;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[]args){
        Scanner date_input = new Scanner(System.in);
        System.out.println("Day: ");    int day = date_input.nextInt();
        //if (1>=day>8){        >< Cannot be applied on .nextint()
/**        switch (day) {
            case 1 -> System.out.println("Mon");
            case 2 -> System.out.println("Tue");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thur");
            case 5 -> System.out.println("Fri");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sun");
            default -> System.out.println("Weekday");
        }
 **/
        String day_type= switch (day){
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(day_type);
    }
}
// Tests days against a set of values, Prints corresponding message