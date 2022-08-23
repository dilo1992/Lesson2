package by.teachmeskills.homework.lesson7;

public class Main {
    public static void main(String[] args) {
        Register register = new Register(10);
        register.addDocument(new Contract());

        register.addDocument(new FinanceDocument());
        register.print();
    }
}
