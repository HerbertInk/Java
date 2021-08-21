package Conditionals_and_Loops;

public class For_Loops {
    public static void main(String[]args){
        System.out.println("x<=5:");
        for (int x = 1; x <= 5; x++){
            System.out.println(x);
            // prints value of x till condition is false
            //On each iteration x++ is executed; By + 1
        }
        System.out.println("y<=10:");
        for (int y = 0; y <= 10; y = y + 2){
            System.out.println(y);
            //prints Even value btwn 0 and 10
        }
    }
}
/*
Syntax
for(initialization; condition; increment/decrement){statement}
Starting and ending numbers are known
*/
