package Conditionals_and_Loops;

public class While_loops  {
    public static void main(String[]args){
        int x = 3;
        while(x > 0){
            System.out.println(x);
            x--;
        }
        System.out.println("Done");

        System.out.println("Loop body skipping");
        int y = 6;
        while (y < 10){
            System.out.println(y);
            ++y;
        }
        System.out.println("Loop Ended");
        System.out.println("?");
        int a = 0; int b = 5;
        while (a < b) {
            System.out.println("Hi");
            ++a;
        }
    }
}
/*
While loop repeatedly
executes a target statement
as long as the given condition is true

x--     decrements x each time the loop runs
Till 0 !!!
*/