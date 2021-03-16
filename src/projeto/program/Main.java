package projeto.program;

import projeto.classes.Leitor;

public class Main {

    public static void main(String[] args) {
        Leitor leitor = new Leitor();

        Thread arquivoA = new Thread(leitor, "arquivoA");
        Thread arquivoB = new Thread(leitor, "arquivoB");


        arquivoA.start();
        arquivoB.start();
    }
}
