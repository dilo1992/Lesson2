package by.teachmeskills.classwork.lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.Month;
import java.util.Date;

public class TestDateMain {
    public static void main(String[] args) throws ParseException {
        LocalDate currentDate = LocalDate.now();   //���� � ��������� ������
        LocalDate nextDate = currentDate.plusDays(1); //�������� plusDays(����� ����������� ����) ��������� ���������� ��������� ������ ���� �� ���������� ���� � �������
        System.out.println(nextDate);
        System.out.println(currentDate.isAfter(nextDate));  //����������, ���� �� ������ ���� ����� ������
        System.out.println(currentDate.isBefore(nextDate));  //����������, ���� �� ������ ���� ����� ������
        System.out.println(currentDate);
        System.out.println(currentDate.getDayOfWeek());  //�������� ���� ������
        System.out.println(currentDate.getMonth());  //�������� �����
        LocalDateTime currentDateTime = LocalDateTime.now(); //���� � ����� �� ����������� � ��������� ������
        System.out.println(currentDateTime);
        LocalTime localTime = LocalTime.now();  //����� � ��������� ������
        System.out.println(localTime);
        ZonedDateTime zonedDateTime=ZonedDateTime.now();  //����� � ���� � ��������� ������ � ������ �������� �����
        System.out.println(zonedDateTime);

        //�������� �� ����� ������� ���� (���������� ���� ���� � ������� �� ����������� ������ Java.time)
        if(Month.SEPTEMBER.equals(currentDate.getMonth())) {
            System.out.println("Today is september");
        }

        //�������� �� ���� ������ ������� ���� (���������� ���� ���� � ������� �� ����������� ������ Java.time)
        if(DayOfWeek.MONDAY.equals(currentDate.getDayOfWeek())) {
            System.out.println("Today is monday");
        }

        System.out.println(currentDate.getDayOfMonth());  //������ ���� ������ ��� ����� ����
        System.out.println(currentDate.getDayOfYear());   //������ ���� ���� ��� ����� ����

        Date date = new Date(0);  //���������� ���� ������ ������� 1 ������ 1970 ����
        System.out.println(date);
        System.out.println(new Date());  //���������� ����������� ����

        System.out.println(date.getTime());  //���������� ����� � ������������� � ������� ������ ������� �� ����� ����


        //SimpleDateFormat
        Date currentDate1 = new Date();  //������� ������� ����
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");  //��������� ������ ��� ������ ���� � �������
        System.out.println(format.format(currentDate1));
        Date newDate = format.parse("22 02 2022");  //������� ���� �������� �������, ������� �� ������ � SimpleDataFormat
        System.out.println(newDate);

        Date myDate = new Date (2022, 5, 3);  //���������� ��� ������, ����������� ������ ��� ����� ����� ������� �� java
        LocalDate myCurrentDate = LocalDate.of(2022, 02, 23);  //�������� ���������� ��� �������� ����
        System.out.println(myCurrentDate);



    }
}
