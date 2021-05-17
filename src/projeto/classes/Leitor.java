package projeto.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Leitor implements Runnable {

    private String path;

    private static final Lock lock = new ReentrantLock();

    public Leitor(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        lock.lock();
        lerArquivo(path);
        lock.unlock();
    }

    public static void lerArquivo(String pathArquivo) {
        File file = new File(pathArquivo);

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
