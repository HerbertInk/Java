package Conditionals_and_Loops;

public class break_and_continue {
    public static void main(String[]args){
        int a = 1;
        while (a > 0){
            System.out.println(a);
            if (a == 4){
                break;
            }
            a++;
        }
        for (int b = 10; b <= 40; b = b + 10){
            if (b == 30){
                continue;   //skips the value of 30 s directed by continue;
            }
            System.out.println(b);
        }
    }
}
/*
Syntax in Loops...
 */
