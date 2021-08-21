package Arrays;

public class Enhanced_for {
    public static void main(String[]args){
        System.out.println("**********Tapping**********");
        int [] primes = {2, 3, 5, 7};

        for (int t: primes){
            System.out.println(t);
        }
        System.out.println("**********Hints**********");
        int [] hint = {1, 2, 3, 4, 5};
        int total = 0;
        for (int x: hint){
            total+= x;
        }
        System.out.println(total);
    }
}
/*for each loop: traverse elements in an array
Eliminates bugs
Easy reading
for block; var: value-current array element
t = corresponding element on loop
 */