package projeto.program;

import projeto.classes.Leitor;

public class Main {

    public static void main(String[] args) {
        Leitor leitor1 = new Leitor("temp\\Arquivo.txt", "A");
        Thread leitorArquivoA = new Thread(leitor1, "Arquivo A");
        leitorArquivoA.start();

        Leitor leitor2 = new Leitor("temp\\ArquivoB.txt", "B");
        Thread leitorArquivoB = new Thread(leitor2, "Arquivo B");
        leitorArquivoB.start();

    }
}
