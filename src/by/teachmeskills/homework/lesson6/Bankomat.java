public class Bankomat {
    private int twenty;
    private int fifty;
    private int oneHundred;

    public Bankomat(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }

    public void addMoney(int addTwenty, int addFifty, int addOneHundred) {
        this.twenty = +addTwenty;
        this.fifty += addFifty;
        this.oneHundred += addOneHundred;
    }

//    public void removeMoney(int removesum) {
//        int sum = twenty * 20 + fifty * 50 + oneHundred * 100;
//        if (sum >= removesum) {
//            boolean b = true;
//            System.out.println("This operation is done!" + b);
//        } else {
//            boolean b = false;
//            System.out.println("This operation isn`t done!" + b);
//        }


    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getOneHundred() {
        return oneHundred;
    }

    public void setOneHundred(int oneHundred) {
        this.oneHundred = oneHundred;
    }

}
