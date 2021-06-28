import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args) {
    int a = 1,b=1;
    while ( b <= 100) {
       a = a + b;
        System.out.print(" " + b);
        b=a-b;
        
    }
}
}
