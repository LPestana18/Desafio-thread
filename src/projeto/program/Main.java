package projeto.program;

import java.io.*;

public class Main {

    public static void main(String[] args) {

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
