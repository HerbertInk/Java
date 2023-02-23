package Intron2Java;

import java.io.*;

class IntDivideTest
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader stdin =
                new BufferedReader ( new InputStreamReader( System.in ) );

        String top, bottom; // input Strings
        int dividend, divisor ; // int versions of input
        int quotient, remainder ; // results of "/" and "%"

        System.out.println("Enter the dividend:"); // read the dividend
        top = stdin.readLine();
        dividend = Integer.parseInt( top );

        System.out.println("Enter the divisor:"); // read the divisor
        bottom = stdin.readLine();
        divisor = Integer.parseInt( bottom );
        quotient = dividend / divisor ; // perform int math
        remainder= dividend % divisor ;

        System.out.println( dividend + " / " + divisor + " is " + quotient );
        System.out.println( dividend + " % " + divisor + " is " + remainder );
        System.out.println( quotient + " * " + divisor +
                " + " + remainder + " is " + (quotient*divisor+remainder) );
    }
}