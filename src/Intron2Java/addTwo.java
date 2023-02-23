package Intron2Java;

import java.io.*;
class addTwo
{
    public static void main (String[] args) throws IOException
    {
        InputStreamReader inStreamR = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader ( inStreamR );

        String line1, line2; // declaration of input Strings
        int first, second, sum ; // declaration of int variables

        System.out.println("Enter first integer:");
        line1 = stdin.readLine();
        first = Integer.parseInt( line1 ); // convert line1 to first int

        System.out.println("Enter second integer:");
        line2 = stdin.readLine();
        second = Integer.parseInt( line2 ); // convert line2 to second int

        sum = first + second; // add the two ints, put result in sum
        System.out.println("The sum of " + first + " plus " + second +" is " + sum );
    }
}