public class ExerciseCreditCard {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("First", 100);
        CreditCard card2 = new CreditCard("Second", 100);
        CreditCard card3 = new CreditCard("Third", 100);

        card1.addMoney(50);
        card2.addMoney(100);
        card3.removeMoney(50);

        card1.print();
        card2.print();
        card3.print();
    }
}
