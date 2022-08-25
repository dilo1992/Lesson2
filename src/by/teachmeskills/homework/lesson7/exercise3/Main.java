package by.teachmeskills.homework.lesson7.exercise3;

public class Main {
    public static void main(String[] args) {
        Register register = new Register(10);
        //register.addDocument(new SupplyContract());

        register.addDocument(new FinanceDocument(1,"01-10-2015",1,"20"));
        register.print();
    }
}
