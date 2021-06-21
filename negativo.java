import java.util.Scanner;
    class Q1 {
        
        public static int quantidadeNegativos(int n){
            int c = 0;
                Scanner teclado = new Scanner(System.in);
            for (int i = 0; i<n;i++ ){
                    System.out.println("Digite um Valor");
                    int v = teclado.nextInt();
                    if (v < 0) c++;
                                     }
            return c;
        }
        
        
    	public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
		System.out.println("Digite Quantos números serão inseridos:");
                int n = teclado.nextInt();
             
                System.out.println("O Total de Númeors Negativos é: " + quantidadeNegativos(n));
                                                }
	}

