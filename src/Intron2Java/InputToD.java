package Intron2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.io.*;
class InputToDouble
{
    public static void main (String[] args) throws IOException
    {
        String charData;
        double value;

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Digit: ");
        charData = stdin.readLine();

                value = Double.parseDouble( charData ) ;
        System.out.println("value: " + value +" twice value: " + 2*value );
    }
}
