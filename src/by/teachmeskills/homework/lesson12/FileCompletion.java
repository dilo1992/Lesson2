package by.teachmeskills.homework.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCompletion {
    public static void main(String[] args) throws WrongNumberException, IOException, FileNotFoundException {
        try (FileWriter fileWriter = new FileWriter("DocumentNumbers.txt")) {
            System.out.println("Enter a number of the document. The number must starts " +
                    "'docnum' or 'contract' and contain digits, and length no more 15 characters");
            for (int i = 1; i <= 10; i++) {
                System.out.print("Document number" + i + ": ");
                Scanner scanner = new Scanner(System.in);
                String numb = scanner.nextLine();
                fileWriter.write(numb + "\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new WrongNumberException();
        }

        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter a path to the required file: ");
            String path = scanner1.nextLine();
            FileReader fileReader = new FileReader(path);
            FileWriter fileWriter2 = new FileWriter("ValidDocumentNumber.txt");
            FileWriter fileWriter3 = new FileWriter("InvalidDocumentNumber.txt");
            Scanner scanner2 = new Scanner(fileReader);
            while (scanner2.hasNextLine()) {
                boolean b = scanner2.nextLine().indexOf("docnum") < 0 || scanner2.nextLine().indexOf("contract") < 0;
                if (b) {
                    try {
                        fileWriter3.write(scanner2.nextLine() + "\tThis number doesn`t starts with 'docnumb' or 'contract'");
                    } catch (IOException ex) {
                        throw new RuntimeException();
                    }
                } else {
                    try {
                        fileWriter2.write(scanner2.nextLine());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
