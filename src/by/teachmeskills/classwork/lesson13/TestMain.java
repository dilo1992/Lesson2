package by.teachmeskills.classwork.lesson13;

import by.teachmeskills.homework.lesson8.exercise2.Dentist;
import by.teachmeskills.homework.lesson8.exercise2.Doctor;

public class TestMain {
    public static void main(String[] args) {
        KeyHolder<String> keyHolder = new KeyHolder<>("myKey");
        keyHolder.setValue("myKey");
        System.out.println(keyHolder.getValue());

        KeyHolder<Integer> keyHolder1 = new KeyHolder<>();
        keyHolder1.setValue(11);
        System.out.println(keyHolder1.getValue());

        KeyHolder<Doctor> keyHolder2 = new KeyHolder<>();
        keyHolder2.setValue(new Dentist());

        DoctorHolder<Dentist> dentistDoctorHolder = new DoctorHolder<>(new Dentist());

        // В дженерики (Т) нельзя вставить эти типы данных в таком виде
        int a;
        double b;
        boolean c;
        float d;
        long e;
        char f;
        byte g;

        //существует обертка для таких типов данных, которые позволяет использовать их
        Integer a1;
        Double b1;
        Boolean c1;
        Float d1;
        Long e1;
        Character f1;
        Byte g1;


    }
}
