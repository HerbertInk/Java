package Conditionals_and_Loops;

import java.util.Scanner;

public class Loan_calculator {
    public  static void main(String[]args){
        Scanner loan_amt = new Scanner(System.in);
        Scanner sign = new Scanner(System.in);
        int amount = loan_amt.nextInt();
        double percent = sign.nextInt();
        //Month 1
        int m1_calc = (int) ((percent) * amount);
        int m1 = (int) (amount + m1_calc);    System.out.println(m1);
        // Month 2
        int m2_calc = (10/100) * m1;
        int m2 = m1 + m2_calc;        System.out.println(m2);
        // Month 3
        int m3_calc = (10%100) * m2;
        int m3 = m2 + m3_calc;        System.out.println(m3);

    }
}
