package by.teachmeskills.classwork.lesson17;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMain {
    public static void main(String[] args) {
        String testString = "678910.this is, my te_st string   12345";
        Pattern pattern = Pattern.compile("\\d+");  //���������, ���� ����� ����������� ������� ������ ���
        Matcher matcher = pattern.matcher(testString);
        System.out.println(matcher.matches());  //����� matches ���������, ������������� �� ��������� ���� ������� ��������.
        // ������ false ������, ��� � ��� � ������ �� ���� �����, � ���� � �����.
        // ���� �� ���� ���� �����, �� ���� �� true

        if (matcher.find()) {                        //���� ���������� �� ������ �������
            System.out.println(matcher.start() + " " + matcher.end());  //start() � end() ������� ������ ������� ������ ���������� � ��������� ���������� � �������
            System.out.println(matcher.group());    //����������� ������ ���������� � �������� (����� ����). group() ����������� ��������� ���������� � �������
        }

        System.out.println("---------------------------------------------");
        // ���� �� ����� ����� ��� ���������� � ������, � �� ������, �� ������ if ���������� while
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
            System.out.println(matcher.group());
        }

        System.out.println("---------------------------------------------");
        //������ ������� ���������� �� ���������. ������ ������� �� �������� ������ � �������� �������, � ������� ����� ������� � ��� ������.
        // �������� ������� �������� ����������
        System.out.println(matcher.replaceAll("***"));

        System.out.println("---------------------------------------------");
        System.out.println(Arrays.asList(testString.split("\\W+")));  //����� ������� �� ��������� � ������, �������� ��������, ������� � �������
        // (\\W+ ��������, ��� ������������ ������ ��� �������� ����� ����, ���� � �������������, ������� � ������� ��� ���� � ���������)

        System.out.println("---------------------------------------------");
        //����� ������ � find() ������������ � �������
        matcher.reset();  // ������� reset() ���������� ���������� ������� matcher � ����. �� ����� ��������� �������� ���������� � ����� ������� � ������� ��� ���������
        matcher.results().forEach(matchResult -> System.out.println(matchResult.group()));

        System.out.println("NEXT IN THE RegexMainTwo CLASS");
    }
}
