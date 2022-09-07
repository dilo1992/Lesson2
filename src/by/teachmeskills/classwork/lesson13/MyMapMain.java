package by.teachmeskills.classwork.lesson13;

import java.util.*;

public class MyMapMain {
    //Map key, value - ключ и значение
    // HashMap - рандомно с использованием hashcode
    // TreeMap - сортированный
    //У нас были задачи: если мы нажали 1 - терапевт, 2 - дантист, 3 -хирург. В Map наши цифры - это ключ.
    //А наши врачи - это значение. То есть 1 - key (ключ), терапевт - value (значение)
    //
    // Например
    // ключ - категория, значение - продукт - List<Product>

    public static void main(String[] args) {
        Map<Integer, String> doctorsMap = new HashMap<>();
        doctorsMap.put(1, "Terapevt"); //вставить
        doctorsMap.put(2, "Surgeon");
        doctorsMap.put(3, "Dentist");
        System.out.println(doctorsMap);

        Map<String, List<String>> productsMap = new HashMap<>();
        productsMap.put("first category", Arrays.asList("first prod", "second prod", "third prod")); //команда asList сама по себе создает ArrayList
        // который ФИКСИРОВАННОГО РАЗМЕРА
        productsMap.put("first category", new ArrayList<>(Arrays.asList("first prod", "second prod", "third prod"))); //так сможет добавить
        productsMap.put("second category", new ArrayList<>());
        System.out.println(productsMap);
        System.out.println(productsMap.get("first category")); //выводит значения по категории
        System.out.println(productsMap.get("first category").get(0)); //выводит значение с индексом 0 из выбранной категории
        List<String> myCurrentList = productsMap.get("second category"); //переводим наши данные из second category в ArrayList
        myCurrentList.add("added product"); //добавляем значение продукта в ArrayList
        System.out.println(productsMap.get("second category").add("my best product")); //добавить в категорию значение
        System.out.println(productsMap);
        productsMap.put("third category", productsMap.get("second category")); //вставляем третью категорию со значениями равными второй категории
        // ТАК ЛУЧШЕ НЕ ДЕЛАТЬ
        System.out.println(productsMap);

        //override list
        //productsMap.put("second category", new ArrayList<>());
        //System.out.println(productsMap);

        System.out.println(productsMap.keySet()); //возвращает все ключи
        System.out.println(productsMap.values()); //возвращает все значения
        System.out.println(productsMap.containsKey("third category")); //проверяем, есть ли такой ключ
        System.out.println(productsMap.containsValue(new ArrayList<>())); //проверяем, есть ли пустой ArrayList (будет false, потому что новый ArrayList)

        Map<Integer, String> doctorsMap2 = new HashMap<>();
        doctorsMap2.put(1, "Dentist");
        System.out.println(doctorsMap2.containsValue("Dentist"));
//        System.out.println(doctorsMap2);
//        System.out.println(productsMap.entrySet());
        for (Map.Entry<Integer, String> element : doctorsMap2.entrySet()) {
            System.out.println("Key: " + element.getKey() + "Value: " + element.getValue());
        }
    }
}