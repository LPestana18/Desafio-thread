package projeto.classes;

import java.io.File;

public class ListaDiretorio {

    public int listaArquivos(File root) {

        System.out.println(root.getName());

        int count = 0;

        for(File file : root.listFiles()) {
            System.out.println(file.getName());
            count++;
        }
        return count;
    }
}
