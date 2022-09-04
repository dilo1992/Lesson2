package by.teachmeskills.homework.lesson11;

import java.util.Scanner;

public class TheSecondExerciseOfLesson11 {
    public static void checkLogin(String login) throws WrongLoginException {
        if (login.length() >= 20) {
            throw new WrongLoginException();
        } else if (login.isEmpty() == true) {

        } else if (login.indexOf(" ") != -1)
            try {

            }

    }
}
