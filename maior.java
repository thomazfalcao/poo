
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os valores de R, S e T");
                float R = teclado.nextFloat();
                float S = teclado.nextFloat();
                float T = teclado.nextFloat();
                if (R>=S) {
                    if (R>=T) System.out.println("R é o Maior");
                    else System.out.println("T é o Maior");
                }
                else {
                    if (S>=T) System.out.println("S é o Maior");
                     else System.out.println("T é o Maior");
                        }
                
                
    }
}
