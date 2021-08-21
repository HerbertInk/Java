package Arrays;

public class Multi_dimensional {
    public static void main(String[]args){
/*
Weekend
 */

        System.out.println("*****Quiz-1*****");
        int result = 0;
        for (int i = 0; i < 5; i++){
            if (i ==3){
                result += 10;
            }else {
                result += i;
            }
        }
        System.out.println(result);
        System.out.println("*****Quiz-2*****");
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++){
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res);
        System.out.println("*****Quiz-3*****");
        int [] k = {1, 2, 3, 4, 5};
        int c = 0;
        for (int el: k){
            c += el;
        }
        System.out.println(c);

    }
}
/* place each array within
it's own set of sq. brackets
 */