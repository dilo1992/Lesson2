package by.teachmeskills.classwork.lesson10;

public class Main3 {
    public static void main(String[] args) {
        String testString = "this is my is example";
        System.out.println(testString.substring(0,7));
        String match = "is";
        int count = getCount(testString, match);
        System.out.println(count);

        int nextCount = getCount(testString, match);
        System.out.println(nextCount);

        //проверка равны ли строчки или нет
        //первый метод учитывает регистр букв, второй - нет
        System.out.println("TEST".equals("test"));
        System.out.println("TEST".equalsIgnoreCase("test"));
    }

    private static int getCount(String testString, String match) {
        int count = 0;
        int index = testString.indexOf(match);
        while (index != -1) {
            count++;
            testString = testString.substring(index + match.length());
            index = testString.indexOf(match);
        }
        return count;
    }
}
