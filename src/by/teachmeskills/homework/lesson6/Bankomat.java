package by.teachmeskills.homework.lesson6;

public class Bankomat {
    private int twenty;
    private int fifty;
    private int oneHundred;

    public Bankomat(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }

    public void addMoney(int twenty, int fifty, int oneHundred) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.oneHundred += oneHundred;
    }

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
