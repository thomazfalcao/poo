import java.util.Scanner;


public class fatorial {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre com um número inteiro: ");
    int numero = teclado.nextInt();
    long fatorial = 1;
    if(numero>0){
        for (int i = 2; i <= numero; i++) {
        fatorial *= i;
        }
    System.out.println("O fatorial desse número é " + fatorial);
    }else{
        System.out.println("Não foi possível calcular");
    }
    }   
}   
