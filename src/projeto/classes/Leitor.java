package projeto.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor implements Runnable {


    @Override
    public void run() {
        leitorArquivo();
    }


    private static void leitorArquivo() {
        File file = new File("Arquivo.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
