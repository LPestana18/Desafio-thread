package projeto.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Leitor implements Runnable {

    private String path;
    private String index;

    private static Lock lock = new ReentrantLock();

    public Leitor(String path, String index) {
        this.path = path;
        this.index = index;
    }

    @Override
    public void run() {
        lock.lock();
        lerArquivo(path, index);
        lock.unlock();
    }

    public static void lerArquivo(String pathArquivo, String index) {
        File file = new File(pathArquivo);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            System.out.println(Thread.currentThread().getName());
            while ((s = br.readLine()) != null) {
                if (s.endsWith(index)) {
                    System.out.println(s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getIndex() {
        return index;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
