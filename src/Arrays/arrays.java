package Arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[]args){
        int[] arr = new int[5];             // Preferred
        arr[2] = 42;
        System.out.println(arr[2]);

        /* Initializing arrays; Array literal
        In curry braces & comma separated
        Auto initialization of an array with,
        store provided values
         */

        String[ ] myNames = {"A", "Bitcoin: Full node", "Blockchain: Cryptography", "Music"};
        System.out.println(myNames[2]); //Bit...

    }
}

/*arr - name, type int, capacity
specific and constant position -index
zero-based index
max index; array int[5] is 4
 */