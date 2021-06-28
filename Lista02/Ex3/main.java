public class Main {
    public static void main(String[] args){
        System.out.println("Criando uma porta...");
        Porta porta = new Porta();
        porta.pintarPorta("Marrom");
        porta.alterarDimensoes(0.6f, 1.8f);
        
        System.out.println("Características da porta: ");
        porta.mostrarPorta();
    
        System.out.println("Antes de abrir a porta... ");
        porta.imprimirEstaAberta();
        porta.abrePorta();
        System.out.println("Depois de abrir a porta... ");
        porta.imprimirEstaAberta();

        System.out.println("Antes de fechar a porta... ");
        porta.imprimirEstaAberta();
        porta.fechaPorta();
        System.out.println("Depois de fechar a porta... ");
        porta.imprimirEstaAberta();

        System.out.println("Antes de pintar a porta... ");
        porta.imprimirCorDaPorta();
        porta.pintarPorta("Cinza");
        System.out.println("Depois de pintar a porta... ");
        porta.imprimirCorDaPorta();

        System.out.println("\nAntes de alterar dimensões da porta... ");
        porta.imprimirDimensaoDaPorta();;
        porta.alterarDimensoes(2.0f, 1.9f);;
        System.out.println("Depois de alterar dimensões da porta... ");
        porta.imprimirDimensaoDaPorta();

        System.out.println("\nCaracterísticas da porta: ");
        porta.mostrarPorta();
    }
}
