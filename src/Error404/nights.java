package Error404;
import java.io.*;
class nights {
    public static void main(String[] args) throws IOException {
        InputStreamReader inStream =
                new InputStreamReader(System.in);
        BufferedReader stdin =
                new BufferedReader(inStream);

        String inData;

        System.out.println("Enter the data:");
        inData = stdin.readLine();
        System.out.println("You entered:" + inData);
    }
}