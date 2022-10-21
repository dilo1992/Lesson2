package by.teachmeskills.homework.lesson18;


import by.teachmeskills.homework.lesson17.MyNameFileFilter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserMain {
    private static ArrayList<String> text = new ArrayList<>();
    private static File XMLForProcess;

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File file;
        int numberOfChoice;
        file = setPathOfFolderWithParsingFile();

        numberOfChoice = setParsingType();
        if (numberOfChoice == 1) {
            SAXMethod(file);
        } else if (numberOfChoice == 2) {
            DOMMethod(file);
        }
    }

    private static int setParsingType() {
        int numberOfChoice;
        do {
            System.out.println("Enter needed method of document processing:\n 1 - SAX\n 2 - DOM\n ");
            Scanner scannerParseMethod = new Scanner(System.in);
            Pattern pattern = Pattern.compile("^[1-2]$");
            Matcher matcher = pattern.matcher(scannerParseMethod.nextLine());
            if (matcher.find()) {
                numberOfChoice = Integer.parseInt(matcher.group());
                break;
            } else {
                System.out.println("Entered data does not match the requirements");
            }
        } while (true);
        return numberOfChoice;
    }

    private static File setPathOfFolderWithParsingFile() {
        File file;
        File[] listFiles;
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
                XMLForProcess = listFiles[scannerNeededFile.nextInt()-1];
                break;
            } else {
                XMLForProcess = listFiles[0];
                break;
            }
        } while (true);
        return file;
    }

    private static void DOMMethod(File file) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory DOMFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder DOMBuilder = DOMFactory.newDocumentBuilder();
        Document document = DOMBuilder.parse(XMLForProcess);
        NodeList nodeListLines = document.getElementsByTagName("lines");
        NodeList nodeListLine = document.getElementsByTagName("line");
        for (int i = 0; i < nodeListLine.getLength(); i++) {
            Node current = nodeListLines.item(0);
            Element element = (Element) current;
            text.add(element.getElementsByTagName("line").item(i).getTextContent());
        }
        writeToFileAfterParse(file);
    }

    private static void SAXMethod(File file) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        XMLSAXHandler SAXHandler = new XMLSAXHandler();
        parser.parse(XMLForProcess, SAXHandler);
        text = SAXHandler.getListWithText();

        writeToFileAfterParse(file);
    }

    private static void writeToFileAfterParse(File file) {
        String addName = "sonnet_lines_line.txt";
        String path = file.getPath() + "\\" + addName;
        try (FileWriter fileWriter = new FileWriter(path)) {
            for (String string : text) {
                fileWriter.write(string + "\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
