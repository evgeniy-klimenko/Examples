package FINALTASK;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Scanner;

public class FileManager extends Copier{
  static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime();

        System.out.print("Enter way to the file: ");
        String waytothedirectory = scanner.nextLine();
        File file = new File(waytothedirectory);

        if (file.exists() && file.isFile()){
            System.out.println("File is avaliable.");
            System.out.println("Enter directory whre you want to copy file: ");
            String secondDirectory = scanner.nextLine();
            File secondFile = new File(secondDirectory);
            if (file.exists() && file.isFile()){
                    run(file,secondFile);
                long endTime = System.nanoTime() - startTime;
                System.out.println("Finished\n" + "Time passed: " + endTime/1000);

            }
            else{
                secondFile.createNewFile();
                run(file, secondFile);
                long endTime = System.nanoTime() - startTime;
                System.out.println("Finished\n" + "Time passed: " + endTime/1000);

            }

        } else {
            System.out.print("\nPlease enter file which exist(rw) or finish(f) work. \n");
            String answer = scanner.nextLine();
            if (answer.contains("rw")){
                System.out.println("\nReenter directory: ");
                String rewrite = scanner.nextLine();
                file = new File(rewrite);

                String secondDirectory = scanner.nextLine();
                System.out.println("Enter directory whre you want to copy file: ");
                File secondFile = new File(secondDirectory);

                run(file, secondFile);
                long endTime = System.nanoTime() - startTime;
                System.out.println("Finished\n" + "Time passed: " + endTime/1000);


            } else if (answer.contains("f")) {
                    System.out.println("Good Bye!)");
                }
            }
    }

}



