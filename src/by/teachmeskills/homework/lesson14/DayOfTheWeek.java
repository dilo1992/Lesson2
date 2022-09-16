package by.teachmeskills.homework.lesson14;

import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String enteredDateInString = inputChecker(scanner);
        try {
            LocalDate enteredDate = LocalDate.of(Integer.parseInt(enteredDateInString.substring(6, 10)), Integer.parseInt(enteredDateInString.substring(3, 5)), Integer.parseInt(enteredDateInString.substring(0, 2)));
            System.out.println("It is " + enteredDate.getDayOfWeek());
        } catch (DateTimeException e) {
            do {
                inputChecker(scanner);
            } while (true);
        }
    }


        private static String inputChecker (Scanner scanner){
            System.out.println("Enter date (for example: dd-MM-yyyy, where " +
                    "a 'dd' is a day of the month, a 'MM' is a month, a 'yyyy' is a year) :");
            String enteredDateInCycle = scanner.nextLine();
            while (enteredDateInCycle.charAt(2) != '-' && enteredDateInCycle.charAt(5) != '-') {
                System.out.println("The entered date is not in the correct format (check for dashes " +
                        "according to pattern)");
                break;
            }
            while ((Integer.parseInt(enteredDateInCycle.substring(0, 2)) <= 0 || (Integer.parseInt(enteredDateInCycle.substring(0, 2)) > 31))) {
                System.out.println("The entered date is not in the correct format (the day of the month is incorrect)");
                break;
            }
            while ((Integer.parseInt(enteredDateInCycle.substring(3, 5)) <= 0 || (Integer.parseInt(enteredDateInCycle.substring(3, 5)) > 12))) {
                System.out.println("The entered date is not in the correct format (the month is incorrect)");
                break;
            }
            while (enteredDateInCycle.length() > 10) {
                System.out.println("The entered date is not in the correct format (check the correctness " +
                        "of the entered data about the year)");
                break;
            }
            String enteredDateInString = enteredDateInCycle;
            return enteredDateInString;
        }
    }
