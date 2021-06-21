
import java.util.Scanner;


public class Q7 {
    
     public static void main(String[] args){
         
         System.out.println("Comece a Inserir as Notas: \n");
         Scanner teclado = new Scanner(System.in);
         int n = teclado.nextInt();
         float p = 0;
         float r = 0;
         float b = 0;
         float o = 0;
         int c = 0;
         while (n>=0 && n<=100){
             c++;
             if(n<=25)p++;
             else if (n<=50)r++;
             else if (n>50 && n<= 75)b++;
             else o++;
             n = teclado.nextInt();
         }
         System.out.println("Notas finalizadas! Foram computadas " + c + " Notas ao Todo!");
         System.out.println("Notas Péssimas = " + 100*p/c + "%");
         System.out.println("Notas Ruins = " + 100*r/c + "%");
         System.out.println("Notas Boas = " + 100*b/c + "%");
         System.out.println("Notas Ótimas = " + 100*o/c + "%");
     }
    
    
}
