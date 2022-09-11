package by.teachmeskills.classwork.lesson6;

public class CreditCard {
    private final String account;
    private int amount;
    private int money;

    public CreditCard(String account, int amount) {
        this.account=account;
        this.amount=amount;
    }

    public void addMoney(int money) {
        this.money = money;
        amount += money;
    }

    public void removeMoney(int money) {
        this.money = money;
        if (money >= amount) {
            System.out.println("This operation isn`t done");
        } else {
            amount -= money;
        }
    }

    public void print() {
    }
}
