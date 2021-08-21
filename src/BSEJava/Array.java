package BSEJava;

import java.util.ArrayList;
import java.util.Locale;

public class Array {
    public static void main(String[]arg){
        //int[] first_five = new int[50];
        /**first_five[0] = 11;
        first_five[1] = 21;
        first_five[2] = 31;
        first_five[3] = 41;
        first_five[4] = 51;*/
        /**int n = 10;
        for(int j = 0; j<first_five.length; j++) {
            first_five[j] = n + 10;
            n++;
            for (int i = 0; i < first_five.length; i++) { //for!
                System.out.print(first_five[i] + " ");

            }
            System.out.println();
            System.out.println(first_five[0] * first_five[1]);*/
        String user_name = "Ink";
        for (int m = 0; m< user_name.length(); m++){
            System.out.println(user_name.charAt(m));
        }
        String Twttr_h = "@BTC_KnightInk";
        for (int m = Twttr_h.length() - 1; m>=0; m--){
            System.out.print(Twttr_h.charAt(m)); //println & print
        }
        System.out.println();
        System.out.println(user_name.toUpperCase(Locale.ROOT));
        ArrayList <Integer> my_list = new ArrayList <Integer> ();
        int listsize;
        listsize = my_list.size();
        System.out.print(listsize);
        my_list.add(10);
        listsize = my_list.size();
        System.out.println(listsize);//ln
        ArrayList <String> names = new ArrayList<String>();
        names.add("Ink");
        names.add("AG");
        names.add("El");
        names.add("Dit");
        names.add("2120");
        names.remove(0);
        //names.add(0,"Them the G's");
        //names.remove(0);
        for(int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }
    }
    }
//}
// length is an operation on string data type