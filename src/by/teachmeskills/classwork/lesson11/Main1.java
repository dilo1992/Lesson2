package by.teachmeskills.classwork.lesson11;

//ловим уже допущенные ошибки
public class Main1 {
    public static void main(String[] args) {
        //Может произойти ошибка. Если ловим, то ничего не делаем, потому что это не из-за кода
        Error er;

        // Может такая ошибка произойти. Эта ошибка из-за кода
        Exception ex;
        RuntimeException rex; //с этой ошибкой тоде ничего не делаем
        // со всеми остальными мы должны что-то делать. Это из-за кода


        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at by.teachmeskills.classwork.lesson11.Main1.main(Main1.java:16)
        int first = 2;
        int second = 0;
        //System.out.println(first / second);

        // конструкция для поиска ошибок (блок try - попробовать, catch - если словили ошибку)
        try {
            //System.out.println(first / second);
            int[] arr = new int[1];
            System.out.println(arr[2]);
        } catch (ArithmeticException e) {
            e.printStackTrace();  // printStackTrace - ловим арифметичские ошибки
            System.out.println(first / 1);
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException - ловим ошибку по массиву
            System.out.println("Index out of array");
        } catch (Exception e) {  //метод Exception - ловит все ошибки
        }
    }
}
