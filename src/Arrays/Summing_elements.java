package Arrays;

public class Summing_elements {
    public static void main(String[]args){
        int[] intArr = new int[5];      //index 4
        System.out.println(intArr.length);
        int[] myArr = {6, 42, 3, 7};
        int sum = 0;
        for(int x = 0; x<myArr.length; x++){
            sum += myArr[x];
        }                                // added each to sum(var)    58
        System.out.println(sum);
    }
}
/*
Length-No. of elements it stores: length property
for loop
length: Run time
last elements index; myArr.length - 1
 */