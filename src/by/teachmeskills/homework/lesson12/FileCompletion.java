package by.teachmeskills.homework.lesson12;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;


public class FileCompletion {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        enterDocumentNumbers(scanner);

        try {
            System.out.println("Enter a path to the required file (input format example: D:\\TMS\\lesson1\\Example.txt): ");
            String path = scanner.nextLine();
            FileReader fileReader = new FileReader(path);
            Scanner scanner1 = new Scanner(fileReader);
            addLocalDate();
            while (scanner1.hasNextLine()) {
                String cause = null;
                String valid = scanner1.nextLine();
                boolean conditionValid = (valid.toLowerCase().indexOf("docnum") == 0 || valid.toLowerCase().indexOf("contract") == 0) && valid.length() == 15;
                if (conditionValid) {
                    try {
                        FileWriter fileWriter = new FileWriter("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson12\\ValidDocumentNumbers.txt", true);
                        fileWriter.write(valid.toLowerCase() + "\n");
                        fileWriter.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    try {
                        FileWriter fileWriter = new FileWriter("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson12\\InvalidDocumentNumbers.txt", true);
                        boolean conditionInvalid = (valid.toLowerCase().indexOf("docnum") != 0 && valid.toLowerCase().indexOf("contract") != 0);
                        if (conditionInvalid && valid.length() != 15) {
                            cause = "this document number doesn`t start at 'docnum' or 'contract' and no specified length";
                        } else if (conditionInvalid) {
                            cause = "this document number doesn`t start at 'docnum' or 'contract'";
                        } else if (valid.length() != 15) {
                            cause = "this document number no specified length (must be 15 symbols)";
                        }
                        fileWriter.write(valid.toLowerCase() + "\t" + cause + "\n");
                        fileWriter.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("EXIT NEED");
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("The data sorted!");
    }


    private static void enterDocumentNumbers(Scanner scanner) {
        try (FileWriter fileWriter = new FileWriter("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson12\\DocumentNumbers.txt")) {
            System.out.println("Enter a number of the document. The number must starts " +
                    "'docnum' or 'contract' and contain digits, and length no more 15 characters");
            for (int i = 1; i <= 10; i++) {
                System.out.print("Document number" + i + ": ");
                String numb = scanner.nextLine();
                fileWriter.write(numb.toLowerCase() + "\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }


    private static void addLocalDate() throws IOException {
        try {
            FileWriter prefileWriter = new FileWriter("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson12\\ValidDocumentNumbers.txt", true);
            prefileWriter.write("\n" + LocalDateTime.now() + "\n\n");
            prefileWriter.close();
            FileWriter prefileWriter2 = new FileWriter("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson12\\InvalidDocumentNumbers.txt", true);
            prefileWriter2.write("\n" + LocalDateTime.now() + "\n\n");
            prefileWriter2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



