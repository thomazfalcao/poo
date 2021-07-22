import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        RepresentaArquivo.representaArquivo("arquivoteste");
        LeAdicionaDados.leArquivo("C:\\Users\\lucas\\Documents\\ArquivosTeste\\arquivoteste.txt");
        LeAdicionaDados.novaEntrada("C:\\Users\\lucas\\Documents\\ArquivosTeste\\arquivoteste.txt");
        LeAdicionaDados.leArquivo("C:\\Users\\lucas\\Documents\\ArquivosTeste\\arquivoteste.txt");
    }
}
