package by.teachmeskills.homework.lesson7.exercise2;

public class PrintNameTitle {
    public static void main(String[] args) {
        Workable director = new Director();
        Workable accountant = new Accountant();
        Workable worker = new Worker();
        director.work();
        accountant.work();
        worker.work();
    }
}
