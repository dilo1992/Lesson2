public class Accountant implements Workable {
    String accountant = "accountant";

    public Accountant() {
        this.accountant = accountant;
    }

    @Override
    public void work() {
        System.out.println("He/She is " + this.accountant);
    }
}
