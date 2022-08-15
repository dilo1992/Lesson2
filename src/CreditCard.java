public class CreditCard {
    private String account;
    private int amount;
    private int money;

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
}
