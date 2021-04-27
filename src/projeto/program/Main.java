package projeto.program;

import projeto.classes.Leitor;
import projeto.classes.ListaDiretorio;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File raiz = new File("C:\\Users\\Lucas Pestana\\Desktop\\Estudo-java\\Desafio\\temp");
        ListaDiretorio listaDiretorio = new ListaDiretorio();
        listaDiretorio.listaArquivos(raiz);


        Leitor leitor = new Leitor("temp\\Arquivo.txt", "a");
        leitor.run();



    }
}
