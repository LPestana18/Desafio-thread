package projeto.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor implements Runnable {

    @Override
    public void run() {
        leitorArquivoA();
        leitorArquivoB();
    }


    private static void leitorArquivoA() {
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

    private static void leitorArquivoB() {
        File file = new File("ArquivoB.txt");

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
