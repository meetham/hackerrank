import java.io.*;
import java.util.*;

public class EndofFile {

    public static void main(String[] args) {
        /* Read input from STDIN. Print output to STDOUT. */
        int line_number=0;
    
      Scanner myScan =new Scanner(System.in); 
       while(myScan.hasNext()){
           line_number++;
            System.out.println(line_number+ " "+myScan.nextLine());
       }

    }
}