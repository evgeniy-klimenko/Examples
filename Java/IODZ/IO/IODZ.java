package IODZ.IO;


import java.io.*;
import java.util.Scanner;

public class IODZ {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.print("Enter directory: ");
        String directory = scanner.nextLine();
        File file = new File(directory);


        if (file.isFile() && file.exists()) {

            BufferedReader input = new BufferedReader(new FileReader(file));
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            System.out.println("Please enter 5 strings");

            for (int i = 0; i < 5; i++) {
                String strings = scanner.nextLine();
                output.write(strings + "\n");
                output.newLine();
            }
            input.close();
            output.close();
        }
        else{
            System.out.println("Inputted dada incorrect!\n " +
                    "Please reenter directory: ");
            String rrenter = scanner.nextLine();
            file = new File(rrenter);
            
            if (file.exists() && file.isFile()){
                BufferedReader input = new BufferedReader(new FileReader(file));
                BufferedWriter output = new BufferedWriter(new FileWriter(file));
                System.out.println("Please enter 5 strings");

                for (int i = 0; i < 5; i++) {
                    String strings = scanner.nextLine();
                    output.write(strings + "\n");
                    output.newLine();
                }
                input.close();
                output.close();
            }
            else {
                System.out.println("There is no such file or directory!!\n" +
                        "Do you want to create new?(y/n)");
                String ansver = scanner.nextLine();
                if (ansver.contains("y")){
                    System.out.println("Please enter name of the file:");
                    String fileName = scanner.nextLine();
                    File newfile = new File(fileName);
                    newfile.createNewFile();

                    BufferedReader input = new BufferedReader(new FileReader(newfile));
                    BufferedWriter output = new BufferedWriter(new FileWriter(newfile));
                    System.out.println("Please enter 5 strings: ");

                        for (int i = 0; i < 5; i++) {
                            String strings = scanner.nextLine();
                            output.write(strings + "\n");
                            output.newLine();
                        }

                    input.close();
                    output.close();
                    
                }
                else if (ansver.contains("n")){
                    System.out.println("Good Bye!!!!!");
                }
            }
            
        }

    }
}




