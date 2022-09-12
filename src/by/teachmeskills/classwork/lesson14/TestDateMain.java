package by.teachmeskills.classwork.lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.Month;
import java.util.Date;

public class TestDateMain {
    public static void main(String[] args) throws ParseException {
        LocalDate currentDate = LocalDate.now();   //дата в насто€щий момент
        LocalDate nextDate = currentDate.plusDays(1); //оператор plusDays(число добавл€емых дней) выполн€ет увеличение введенной первой даты на количество дней в скобках
        System.out.println(nextDate);
        System.out.println(currentDate.isAfter(nextDate));  //сравнивает, идет ли перва€ дата после второй
        System.out.println(currentDate.isBefore(nextDate));  //сравнивает, идет ли перва€ дата перед второй
        System.out.println(currentDate);
        System.out.println(currentDate.getDayOfWeek());  //получить день недели
        System.out.println(currentDate.getMonth());  //получить мес€ц
        LocalDateTime currentDateTime = LocalDateTime.now(); //дата и врем€ до миллисекунд в насто€щий момент
        System.out.println(currentDateTime);
        LocalTime localTime = LocalTime.now();  //врем€ в насто€щий момент
        System.out.println(localTime);
        ZonedDateTime zonedDateTime=ZonedDateTime.now();  //врем€ и дата в насто€щий момент с учетом часового по€са
        System.out.println(zonedDateTime);

        //проверка на мес€ц текущей даты (сравниваем нашу дату с данными из встроенного класса Java.time)
        if(Month.SEPTEMBER.equals(currentDate.getMonth())) {
            System.out.println("Today is september");
        }

        //проверка на день недели текущей даты (сравниваем нашу дату с данными из встроенного класса Java.time)
        if(DayOfWeek.MONDAY.equals(currentDate.getDayOfWeek())) {
            System.out.println("Today is monday");
        }

        System.out.println(currentDate.getDayOfMonth());  //узнаем день мес€ца дл€ нашей даты
        System.out.println(currentDate.getDayOfYear());   //узнаем день года дл€ нашей даты

        Date date = new Date(0);  //возвращает дату начала отсчета 1 €нвар€ 1970 года
        System.out.println(date);
        System.out.println(new Date());  //возвращает сегодн€шний день

        System.out.println(date.getTime());  //возвращает врем€ в миллисекундах с момента начала отсчета до нашей даты


        //SimpleDateFormat
        Date currentDate1 = new Date();  //создаем текущую дату
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");  //указываем формат дл€ вывода даты и времени
        System.out.println(format.format(currentDate1));
        Date newDate = format.parse("22 02 2022");  //создаем дату согласно формату, который мы задали в SimpleDataFormat
        System.out.println(newDate);

        Date myDate = new Date (2022, 5, 3);  //устаревший тип данных, зачеркнутый потому что могут скоро удалить из java
        LocalDate myCurrentDate = LocalDate.of(2022, 02, 23);  //Ќј»ЅќЋ≈≈ ѕ–ј¬»Ћ№Ќџ… “»ѕ —ќ«ƒјЌ»я ƒј“џ
        System.out.println(myCurrentDate);



    }
}
