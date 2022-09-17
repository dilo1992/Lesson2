package by.teachmeskills.homework.lesson14;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;


public class NextTuesday {
    public static void main(String[] args) {
        String dateInMethod;
        LocalDate enteredDate = null;
        boolean success = false;
        while (!success) {
            try {
                dateInMethod = enteredDateWithChecker();
                enteredDate = LocalDate.of(Integer.parseInt(dateInMethod.substring(6, 10)),
                        Integer.parseInt(dateInMethod.substring(3, 5)), Integer.parseInt(dateInMethod.substring(0, 2)));
                success = true;
            } catch (DateTimeException | NumberFormatException | WrongFormatException e) {
                System.out.println(e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("The entered date is not in the correct format (check the correctness of the entered data about the year)");
            }
        }
        System.out.println(nextTuesdayChecker(enteredDate));
    }


    private static LocalDate nextTuesdayChecker(LocalDate enteredDate) {
        LocalDate nextTuesday = enteredDate;
        while (!(DayOfWeek.TUESDAY.equals(nextTuesday.getDayOfWeek()))) {
            if (!DayOfWeek.TUESDAY.equals(nextTuesday.getDayOfWeek())) {
                nextTuesday = nextTuesday.plusDays(1);
            }
        }
        nextTuesday = nextTuesday.plusWeeks(1);
        return nextTuesday;
    }


    private static String enteredDateWithChecker() throws WrongFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date (for example: dd-MM-yyyy, where " +
                "a 'dd' is a day of the month, a 'MM' is a month, a 'yyyy' is a year) :");
        String enteredDateInString = scanner.nextLine();
        if (enteredDateInString.length() > 10 && enteredDateInString.length() < 9) {
            throw new WrongFormatException(enteredDateInString);
        }
        if (enteredDateInString.charAt(2) != '-' && enteredDateInString.charAt(5) != '-') {
            throw new WrongFormatException(enteredDateInString);
        }
        return enteredDateInString;
    }
}
