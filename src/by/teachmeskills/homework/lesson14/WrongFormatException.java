package by.teachmeskills.homework.lesson14;

public class WrongFormatException extends Exception {

    public WrongFormatException(String enteredDateInString) {
        super("The entered date is not in the correct format");
        if (enteredDateInString.length() > 10 && enteredDateInString.length() < 9) {
            System.out.println("The entered date is not in the correct format (check the correctness " +
                    "of the entered data about the year)");
        } if (enteredDateInString.charAt(2) != '-' && enteredDateInString.charAt(5) != '-') {
            System.out.println("The entered date is not in the correct format (check for dashes " +
                    "according to pattern)");
        }
    }
}