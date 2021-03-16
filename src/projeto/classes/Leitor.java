package projeto.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor implements Runnable {

    @Override
    public void run() {

        File file = new File("temp");
        File[] arquivos = file.listFiles();
        for (int i = 0; i < arquivos.length; i++) {

            System.out.println(arquivos[i].getName());
        }

        System.out.println("Lendo ArquivoA");
        lerArquivo("temp\\Arquivo.txt", "a");
        System.out.println("Lendo ArquivoB");
        lerArquivo("temp\\ArquivoB.txt", "b");
    }

    public static synchronized void lerArquivo(String pathArquivo, String index) {
        File file = new File(pathArquivo);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null) {
                if (s.endsWith(index)) {
                    System.out.println(s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
