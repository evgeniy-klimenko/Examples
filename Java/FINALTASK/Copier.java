package FINALTASK;

import java.io.*;

import static FINALTASK.FileManager.scanner;

public class Copier extends Thread{



    public static void run (File file, File secondFile) throws IOException {
        System.out.println("Enter number of Threads: ");
        int numberOfThreads = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Size of buffer: ");
        int sizeOfBuffer = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread();
            thread.run();
            for (int j = 0; j < numberOfThreads; j++) {
                int length;
                InputStream in = new FileInputStream(file);
                OutputStream out = new FileOutputStream(secondFile);
                byte[] buffer = new byte[sizeOfBuffer];
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                in.close();
                out.close();
            }
        }
    }
}
