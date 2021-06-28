import java.util.Scanner;


public class Q8 {
    
    public static boolean ehQuadradoMagico(int [][] matriz){
        int soma = 0;
        int soma2 = 0;
        
        for(int j =0; j<matriz[0].length;j++){
            soma =+ matriz[0][j];
        }
        for(int i = 1; i<matriz.length;i++){
            soma2 = 0;
            for(int j =0; j<matriz[i].length; j++){
                soma2 =+ matriz [i][j];
            }
            if(soma2 != soma){
                return false;
            }
        }
        for (int j = 0; j<matriz[0].length;j++){
            soma2 = 0;
            for(int i = 0; i<matriz.length;j++){
                soma2 =+ matriz[i][j];
            }
            if(soma2 != soma){
                return false;
            }
        }
        soma2 =0;
        for(int i = 0; i<matriz.length;i++){
            soma2 =+ matriz[i][i];
        }
        if(soma2 != soma){
            return false;
        }
        soma2 = 0;
        int i = 0;
        for(int j = matriz.length -1; j>0;j--){
            soma2 =+ matriz[i][j];
            i++;
        }
         if(soma2 != soma){
                return false;
            }
         return true;
    }
    
    
    public static void main(String[] args){
        System.out.println("Insira a Ordem da Matriz");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int [][] matriz = new int[n][n];
        
        for(int l=0; l<matriz.length;l++){
		 		for(int c=0; c<matriz.length;c++){
		 			System.out.println("Digite o elemento " + l + " " + c + " da matriz :");
		 			matriz[l][c]= teclado.nextInt();
		 		}
		 	}
        if(ehQuadradoMagico(matriz))System.out.println("É Quadrado Mágico!");
        else System.out.println("Não é Quadrado Mágico!");
    }
    
}
