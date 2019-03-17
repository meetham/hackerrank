import java.util.Scanner;

public class OutPutFormatting {

    public static void main(String[] args) {
        /*Each line of input contains a String followed by an integer
        Each string will have a max of 10 characters
        Sample:
        java 100
        cpp 65
        python 50
        */
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                /* EAch String is left justified with trailing whitespace through the first 15                      characters
                    Sample:
                    ================================
                    java           100 
                    cpp            065 
                    python         050 
                    ================================*/
                System.out.printf("%-15s",s1);
                System.out.printf("%03d\n",x);

            }
            System.out.println("================================");

    }
}