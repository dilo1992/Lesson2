package by.teachmeskills.classwork.lesson10;

public class Main4 {
    public static void main(String[] args) {
        //для просмотра как отработает сортировка
        System.out.println("test".compareTo("aest")); //если число положительное,
                                                      // то при сортировке строчка aest должна стоять раньше test
                                                      // чем больше число, тем дальше число от числа при сортировке
        System.out.println("test".compareTo("test")); //если строчки одинаковые - то в результате 0
        System.out.println("test".compareTo("zest")); //если число отрицательное, то строчка test должна стоять
        System.out.println("test".compareTo("test1")); //раньше при сортировке чем zest и test1

        // проверяет есть ли искомое слово в выражении
        //чтоб не было недоразумений с регистром символов, применяем метод toLowerCase() для строки и для искомого выражения
        String str = "This is our string";
        System.out.println(str.toLowerCase().contains("our".toLowerCase()));


    }
}
