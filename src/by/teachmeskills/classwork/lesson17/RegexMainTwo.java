package by.teachmeskills.classwork.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMainTwo {
    public static void main(String[] args) {
        List<String> testList = Arrays.asList("123455", "1bb1a1", "11a 1", "8", "325", "3244", "42,55");

        System.out.println("--------------------EXERCISE 1-------------------------");
        // ^a -���������� � � (����� ������ �)
        Pattern pattern = Pattern.compile("^\\d+$"); //������� ��������, ��� � ������ ������ (^ (��� ������))
        // ����� ���� ����� (\\d) �� ������ �� ������������� (+) �� ������ ����� ($)
        //���� �� ������������ ������ ����� "+" ��������� "*", �� � ������� ���� �� �� �� 1 �� �������������, � �� ����,
        // ������� �� �������������.
        // ���� �������� ��� "\\d&$" - �� ������� ������ ��������� �������
        for (String current : testList) {
            Matcher matcher = pattern.matcher(current);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        System.out.println("--------------------EXERCISE 2-------------------------");
        Pattern pattern2 = Pattern.compile("[25]$"); //������� ��������, ��� � ����� ������ ���� ���� ����� 2 ��� 5
        // � ����� 25 - "25+$"
        //�� 2 � �� 5 � ����� - [^25]+$ - ���� ����� � ���������� ������� - �� ����� ��� ���
        for (String current : testList) {
            Matcher matcher2 = pattern2.matcher(current);
            if (matcher2.find()) {
                System.out.println(matcher2.group());
            }
        }

        System.out.println("--------------------EXERCISE 3-------------------------");
        Pattern pattern3 = Pattern.compile("^[a-zA-Z0-9]+$"); //������� ��������, ��� �� ������ �� ����� ����� ���� ��� �����
        // � ������ ��������, ��� ����� � ������� ��������, � ��� �����. ��������� �������: �������, ��������� � ��� ����� - ���
        for (String current : testList) {
            Matcher matcher3 = pattern3.matcher(current);
            if (matcher3.find()) {
                System.out.println(matcher3.group());
            }
        }

        System.out.println("---Pattern.CASE_INSENSITIVE-----");

        // ��� ��� Pattern.compile("^[A-Z0-9]+$", Pattern.CASE_INSENSITIVE) - �� ������� �� �����������
        Pattern patternWithOutCase = Pattern.compile("^[A-Z0-9]+$", Pattern.CASE_INSENSITIVE);
        for (String current : testList) {
            Matcher matcherWitoutCase = patternWithOutCase.matcher(current);
            if (matcherWitoutCase.find()) {
                System.out.println(matcherWitoutCase.group());

            }
        }


        System.out.println("--------------------EXERCISE 4-------------------------");
        //���� ���� ��� ��������, � �� ����� �������� ��� ����, ��� ������, �� ���
        //Pattern pattern4 = Pattern.compile("([A-Z] | [3-5])$", Pattern.CASE_INSENSITIVE);  //���� � ����� ($) ������ ��� A-Z (��� ����� ��������),
        // ��� �� 3 �� 5
        Pattern pattern4 = Pattern.compile(".*[3-5]$", Pattern.CASE_INSENSITIVE);
        for (String current : testList) {
            Matcher matcher4 = pattern4.matcher(current);
            if (matcher4.find()) {
                System.out.println(matcher4.group());
            }
        }

        System.out.println("--------------------EXERCISE 5-------------------------");
        //Pattern pattern5 = Pattern.compile("\\D+$", Pattern.CASE_INSENSITIVE); //\\D - �� �����
        //Pattern pattern5 = Pattern.compile("\\D\\s+$", Pattern.CASE_INSENSITIVE); //\\D - �� ����� ����� ���� ������ (\\s)
        Pattern pattern5 = Pattern.compile("\\D\\S+$", Pattern.CASE_INSENSITIVE); //\\D - �� ����� ����� ���� �� ������ (\\S)
        // ���� ��� ����� ������ (^), � ������ �����($), �� ��� ������� � �����
        for (String current : testList) {
            Matcher matcher5 = pattern5.matcher(current);
            if (matcher5.find()) {
                System.out.println(matcher5.group());
            }
        }

        System.out.println("--------------------EXERCISE 6-------------------------");
        //Pattern pattern6 = Pattern.compile("\\w+$", Pattern.CASE_INSENSITIVE); // \\w - ����������� ������ ������ ��� ����� [a-zA-Z_0-9]
        Pattern pattern6 = Pattern.compile("\\W+$", Pattern.CASE_INSENSITIVE); // \\W - �� \\w (� ����� ������ ������)
        for (String current : testList) {
            Matcher matcher6 = pattern6.matcher(current);
            if (matcher6.find()) {
                System.out.println(matcher6.group());
            }
        }

        System.out.println("--------------------EXERCISE 7-------------------------");
        Pattern pattern7 = Pattern.compile("\\b+$", Pattern.CASE_INSENSITIVE); // \\b - ������� �����
        for (String current : testList) {
            Matcher matcher7 = pattern7.matcher(current);
            if (matcher7.find()) {
                System.out.println(matcher7.start() + " " + matcher7.end());
                System.out.println(matcher7.group());
            }
        }
    }
}
