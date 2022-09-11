package by.teachmeskills.homework.lesson13;

import java.util.*;


public class MapFruitsVegetableBerries {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        List<String> fruits = new ArrayList<>();
        List<String> vegetables = new ArrayList<>();
        List<String> berries = new ArrayList<>();
        products.put("Fruits", fruits);
        products.put("Vegetables", vegetables);
        products.put("Berries", berries);
        String cat;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a category, number or name of class (1 - Fruits, 2 - Vegetables, " +
                    "3 - Berries, 4 - Print results, exit for exit): ");
            cat = scanner.nextLine().toLowerCase();
            Scanner sc1;
            Scanner sc2;
            if (cat.equals("1") || cat.equals("fruit") || cat.equals("fruits")) {
                System.out.println("Enter fruits (separated by comma and space): ");
                sc1 = new Scanner(System.in);
                String scannerFruits = sc1.nextLine();
                sc2 = new Scanner(scannerFruits);
                while (sc2.hasNext()) {
                    String inputInArr = sc2.next();
                    inputInArr = checkerDotAndComma(inputInArr);
                    //fruits.add(inputInArr);
                    products.get("Fruits").add(inputInArr);
                }
            }
            if (cat.equals("2") || cat.equals("vegetable") || cat.equals("vegetables")) {
                System.out.println("Enter vegetables (separated by comma and space): ");
                sc1 = new Scanner(System.in);
                String scannerVegeables = sc1.nextLine();
                sc2 = new Scanner(scannerVegeables);
                while (sc2.hasNext()) {
                    String inputInArr = sc2.next();
                    inputInArr = checkerDotAndComma(inputInArr);
                    products.get("Vegetables").add(inputInArr);
                }
            }
            if (cat.equals("3") || cat.equals("berry") || cat.equals("berries")) {
                System.out.println("Enter berries (separated by comma and space): ");
                sc1 = new Scanner(System.in);
                String scannerBerries = sc1.nextLine();
                sc2 = new Scanner(scannerBerries);
                while (sc2.hasNext()) {
                    String inputInArr = sc2.next();
                    inputInArr = checkerDotAndComma(inputInArr);
                    products.get("Berries").add(inputInArr);
                }
            }
            if (cat.equals("4") || cat.equals("print") || cat.equals("print results")) {
                System.out.println("Fruits: " + products.get("Fruits"));
                System.out.println("Vegetables: " + products.get("Vegetables"));
                System.out.println("Berries: " + products.get("Berries"));
            }
        } while (!cat.equals("exit"));
    }

    //метод для удаления точек и запятых, которые попадаются при взятии слова операцией .next()
    private static String checkerDotAndComma(String inputInArr) {
        if (inputInArr.contains(".")) {
            int dot = inputInArr.indexOf(".");
            StringBuilder sb = new StringBuilder(inputInArr);
            inputInArr = String.valueOf(sb.deleteCharAt(dot));
        } else if (inputInArr.contains(",")) {
            int comma = inputInArr.indexOf(",");
            StringBuilder sb = new StringBuilder(inputInArr);
            inputInArr = String.valueOf(sb.deleteCharAt(comma));
        }
        return inputInArr;
    }
}
