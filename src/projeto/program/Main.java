package projeto.program;

import projeto.classes.Leitor;

public class Main {

    public static void main(String[] args) {
        Leitor leitor1 = new Leitor("temp\\Arquivo.txt", "a");
        Thread leitorArquivoA = new Thread(leitor1, "Arquivo A");
        leitorArquivoA.start();

        Leitor leitor2 = new Leitor("temp\\ArquivoB.txt", "b");
        Thread leitorArquivoB = new Thread(leitor2, "Arquivo B");
        leitorArquivoB.start();

    }
}
