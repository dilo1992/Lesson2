public class CreditCard {
    private String account;
    private int amount;
    private int money;

    public CreditCard(String account, int amount) {
        this.account = account;
        this.amount = amount;
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
        this.account = account;
        this.amount = amount;
        System.out.println("A account your CreditCard is " + account + " , and an amount in it is " + amount);
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
