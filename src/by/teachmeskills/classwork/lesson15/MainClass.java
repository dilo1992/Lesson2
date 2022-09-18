package by.teachmeskills.classwork.lesson15;

import java.util.Locale;

public class MainClass {
    /**
     * создали класс person
     *
     * @param args
     */
    public static void main(String[] args) {
        Person firstPerson = new Person(20, "Vova");//первый человек
        Person secondPerson = new Person(25, "Nikita");//второй человек
        secondPerson.setNickname("Nick");//даём первому nickname через метод set
        if(secondPerson.getOptionalNickname().isPresent()){
            secondPerson.getOptionalNickname().get();//можно достать значение из оптиональ
        }
        secondPerson.getOptionalNickname().map(nick->"Nick:"+nick).ifPresentOrElse(nick-> System.out.println(nick),()->
        System.out.println("Empty nick"));
        secondPerson.getOptionalNickname().map(nick->"Nick:"+(nick.length() + 3)).ifPresentOrElse(nick-> System.out.println(nick),()->//он склеит 3 и 4 потому что я написал nick если добавить скобкти то он сразу посчитает, а потом склеит или напишет сразу без ника
                System.out.println("Empty nick"));
        secondPerson.getOptionalNickname()
                .map(nick->"Nick:"+(nick.length() + 3))
                .filter(value -> value.length() > 7)
                .ifPresentOrElse(nick-> System.out.println(nick),()-> System.out.println("Empty nick"));
        //secondPerson.getOptionalNickname().ifPresent(nick-> System.out.println(nick));//выводит что-то если nick есть
        secondPerson.getOptionalNickname().ifPresentOrElse(nick-> System.out.println(nick.length()),()-> System.out.println(0));//если ника нет, то выведет ноль
        //System.out.println("Here:"+firstPerson.getNickname());
        System.out.println("Here:"+firstPerson.getOptionalNickname());
       //бросает определенную ошибку String nickName=firstPerson.getOptionalNickname().orElseThrow();// идея выведет нал, но у нала нет методов, в сауут она его выведет, эта штука кидает ошибку
       // System.out.println(nickName);//берет строчку из метода выше
        String nickName2=firstPerson.getOptionalNickname().orElseThrow(()->new RuntimeException("Egegei0000000000000000"));
        System.out.println(nickName2);//берет строчку из метода выше
        //System.out.println("Длина ника первого человека:" + secondPerson.getNickname().length());
        //System.out.println(firstPerson.getNickname().length());//будет ругаться так как у первого Person нет nickname, поэтому делаем if, но это все равно неудобно, поэтому в 8 Java есть нововведение public class Optional, смотреть класс Person
        //     if (secondPerson.getNickname() != null) {
        //    System.out.println("Длина ника первого человека:" + secondPerson.getNickname().length());
       /// } else {
          //  System.out.println(0);
       /// }
        ///if (firstPerson.getNickname() != null) {
           /// System.out.println(secondPerson.getNickname().length());
        //} else {
          //  System.out.println(0);
       /// }
        //  if (firstPerson.getOptionalNickname().isPresent()){//это штука не популярна
      //  }
        //  if (firstPerson.getOptionalNickname().isEmpty()){//это штука не популярна
        //  }
        firstPerson.getOptionalNickname().ifPresent(nick-> System.out.println(nick));//вот топовый вариант
        System.out.println(firstPerson.getOptionalNickname().orElse("").length());//выводит просто кавычки если нет ника (если там null)
        System.out.println(secondPerson.getOptionalNickname().orElse(getTestString()).length());//ctrl+/ закомментить все//даже если эта часть с методом не понадобиться то он все равно выведет метод

        System.out.println(firstPerson.getOptionalNickname().orElseGet(()->" ").length());
        System.out.println(secondPerson.getOptionalNickname().orElseGet(()->getTestString()).length());
    }//после всего этого можно попробовать вывести метод set nick
    private static String getTestString(){
        System.out.println("this is test string");
        return "";
    }
}
