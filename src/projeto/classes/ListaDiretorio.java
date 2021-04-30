package projeto.classes;

import java.io.File;

public class ListaDiretorio {

    public File[] listaArquivos(File root) {
        return root.listFiles();
    }
}
