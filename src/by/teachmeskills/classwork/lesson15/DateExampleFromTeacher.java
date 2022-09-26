package by.teachmeskills.classwork.lesson15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExampleFromTeacher {
    public static void main(String[] args) {

        //для ввода даты в заданном формате
        LocalDate date = LocalDate.parse("26-09-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(date.getDayOfWeek());
    }
}
