package projeto.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        lendoArquivoB();
        lendoArquivoA();
    }

    public static void lendoArquivoA() {
        File file = new File("temp\\Arquivo.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null) {
                if(s.endsWith("a") ||  s.endsWith("A")) {
                    System.out.println(s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lendoArquivoB()  {
        File file = new File("temp\\ArquivoB.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null) {
                if(s.endsWith("b") || s.endsWith("B")) {
                    System.out.println(s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
