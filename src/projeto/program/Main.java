package projeto.program;

import projeto.classes.Leitor;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        leitor.run();
    }


    public static void lerArquivo(String pathArquivo, String index) {
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
