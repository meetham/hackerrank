import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loops1 {

/*Given an integer, N, print its first 10 multiples. Each multiple N x i (where1 <= i <=10 ) should be printed on a new line in the form: N x i = result.*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<11;i++){
            int multiplied=N*i;
            System.out.printf("%d x %d = %d%n",N,i,multiplied);
        }
        scanner.close();
    }
}
