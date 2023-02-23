package Intron2Java;
// This program requires Java 1.2 or higher

import java.io.*;

class StringToDouble
{
    public static void main (String[] args)
    {
        final String charData = "3.14159265";
        double value;
        value = Double.parseDouble( charData ) ;
        System.out.println("value: " + value +" twice value: " + 2*value );
    }
}