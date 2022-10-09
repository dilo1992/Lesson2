package by.teachmeskills.homework.lesson18;

import by.teachmeskills.homework.lesson17.MyNameFileFilter;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SAXParserMain {
    private static ArrayList<String> text = new ArrayList<>();
    private static File XMLForProcess;

    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        File[] listFiles;
        File file;
        do {
            System.out.println("Enter document folder name: ");
            Scanner scanner = new Scanner(System.in);
            file = new File(scanner.nextLine());
            if (!file.exists()) {
                System.out.println("This folder is not found");
                continue;
            }
            listFiles = file.listFiles(new MyNameFileFilter(".xml"));
            if (listFiles.length == 0) {
                System.out.println("This folder does not contain files of the required format");
                continue;
            } else if (listFiles.length > 1) {
                System.out.println("This folder contains two or more files of the required format");
                for (int i = 0; i < listFiles.length; i++) {
                    System.out.println((i + 1) + ". " + listFiles[i].toString());
                }
                System.out.println("Enter the number corresponding to the document required for processing");
                Scanner scannerNeededFile = new Scanner(System.in);
                XMLForProcess = listFiles[scannerNeededFile.nextInt()];
                break;
            } else {
                XMLForProcess = listFiles[0];
                break;
            }
        } while (true);

        System.out.println(XMLForProcess.getName());

//        int numberOfChoice;
//        do {
//            System.out.println("Enter needed method of document processing:\n 1 - SAX\n 2 - DOM\n ");
//            Scanner scannerParseMethod = new Scanner(System.in);
//            Pattern pattern = Pattern.compile("^[1-2]$");
//            Matcher matcher = pattern.matcher(scannerParseMethod.nextLine());
//            if (matcher.find()) {
//                numberOfChoice = Integer.parseInt(matcher.group());
//                break;
//            } else {
//                System.out.println("Entered data does not match the requirements");
//            }
//        } while (true);
//
////        if (numberOfChoice == 1) {
////
////        } else if (numberOfChoice == 2) {
////
////        }

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();





    }
}
