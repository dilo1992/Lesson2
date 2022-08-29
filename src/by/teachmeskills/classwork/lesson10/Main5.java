package by.teachmeskills.classwork.lesson10;

public class Main5 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("MyString: ");
        builder.append("this ").append("is ").append("my ").append("house");

        String result = builder.toString();
        System.out.println(result);

        //перевернуть строчку задом наперед
        //System.out.println(builder.reverse().toString());

        //вставить символы в строчку. Задаем место куда вставить и что вставить
        builder.insert(10,"ooph ");
        System.out.println(builder);

        //удалить символ из строчки (deleteCharAt - один символ, delete - участок с ... до ...)
        builder.deleteCharAt(20);
        System.out.println(builder);
        builder.delete(2,8);
        System.out.println(builder);
    }
}
