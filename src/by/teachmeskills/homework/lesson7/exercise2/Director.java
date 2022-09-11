package by.teachmeskills.homework.lesson7.exercise2;

import by.teachmeskills.homework.lesson7.exercise2.Workable;

public class Director implements Workable {
    String director = "director";

    public Director() {
        this.director = director;
    }

    @Override
    public void work() {
        System.out.println("He/She is " + this.director);
    }
}
