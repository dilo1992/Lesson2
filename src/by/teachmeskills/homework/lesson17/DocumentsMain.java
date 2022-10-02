package by.teachmeskills.homework.lesson17;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentsMain {
    public static void main(String[] args) throws IOException, RuntimeException {
        // String test = "g1111-fff-2222-fff-2g5g444";
        //String testEmail = "lionel_messi@mail.ru";
        //String testPhone = "+(29)2922929";
        Map <String, Document> documents = new HashMap<>();
        System.out.println("Enter document folder name: ");
        Scanner scanner = new Scanner(System.in);
        String pathOfFolder = scanner.nextLine();
        File file = new File(pathOfFolder);
        String[] arrOfFiles = file.list();
        String docNumberCheckerPattern = "(\\d{4}-)([a-zA-Z]{3}-)(\\d{4}-)([a-zA-Z]{3}-)(\\d[a-zA-Z]\\d[a-zA-Z])";
        String emailCheckerPattern = "[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}";
        String phoneNumberCheckerPattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{2}-?\\|d{2}-?\\+?\\(\\d{2}\\)\\d{3}d{2}-?\\d{2}-?\\d{2}-?|\\+?(\\d{0,3})\\(\\d{2}\\)\\d{7}";
        Pattern pattern = Pattern.compile(docNumberCheckerPattern);
        Pattern pattern1 = Pattern.compile(emailCheckerPattern, Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile(phoneNumberCheckerPattern);
        //выводим на печать названия всех файлов из папки
        for (File currentFile : file.listFiles()) {
            Document document=new Document();
            List<String> numberDoc = new ArrayList<>();
            try {
                try (FileReader fileReader = new FileReader(currentFile)) {
                    Scanner scanner1 = new Scanner(fileReader);
                    while (scanner1.hasNextLine()) {
                        Matcher matcherDocNumb = pattern.matcher(scanner1.nextLine());
                        while (matcherDocNumb.find()) {
                            //System.out.println(matcher.group());
                            numberDoc.add(matcherDocNumb.group());
                        }
                    }
                }
                document.setDocumentsNumber(numberDoc);

                try (FileReader fileReader = new FileReader(currentFile)) {
                    Scanner scanner1 = new Scanner(fileReader);
                    while (scanner1.hasNextLine()) {
                        Matcher matcherEmail = pattern1.matcher(scanner1.nextLine());
                        while (matcherEmail.find()) {                       //ищем совпадения по нашему шаблону
                            //System.out.println(matcherEmail.group());    //Распечатает первое совпадение с шаблоном (набор цифр). group() сгруппирует найденное совпадение в строчку
                            document.setEmail(matcherEmail.group());
                        }
                    }
                }

                try (FileReader fileReader = new FileReader(currentFile)) {
                    Scanner scanner1 = new Scanner(fileReader);
                    while (scanner1.hasNextLine()) {
                        Matcher matcherPhoneNumb = pattern2.matcher(scanner1.nextLine());
                        while (matcherPhoneNumb.find()) {                       //ищем совпадения по нашему шаблону
                            //System.out.println(matcherPhoneNumb.group());    //Распечатает первое совпадение с шаблоном (набор цифр). group() сгруппирует найденное совпадение в строчку
                            document.setPhoneNumber(matcherPhoneNumb.group());
                        }
                    }
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(document.toString());
        }
    }
}
