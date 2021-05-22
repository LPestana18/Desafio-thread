package projeto.program;

import projeto.classes.Leitor;
import projeto.classes.ListaDiretorio;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        File raiz = new File("C:\\Users\\Lucas Pestana\\Desktop\\Estudo-java\\Desafio\\temp");
        ListaDiretorio listaDiretorio = new ListaDiretorio();

        List<File> files = Arrays.asList(listaDiretorio.listaArquivos(raiz));

        for (File f : files) {
            System.out.println(f.getName());
            Leitor leitor = new Leitor(f.toString());
            leitor.run();
        }
        System.out.println("Hello World");
    }
}
