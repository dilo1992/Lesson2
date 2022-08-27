package by.teachmeskills.homework.lesson7.exercise3;

public class Main {
    public static void main(String[] args) {
        Register register = new Register(10);
        register.addDocument(new SupplyContract(32,2020,9,20,"String",100));
        register.addDocument(new ContractWithWorker(20,2010,5,1,2021,5,1,"Vasya"));
        register.addDocument(new FinanceDocument(10,2014,5,8,1000,"apples"));
        register.print();
    }
}
