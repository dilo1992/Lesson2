package by.teachmeskills.homework.lesson7.exercise3;

public class FinanceDocument extends Document implements Printable {
    private int sum;
    private String code;

//    public FinanceDocument() {
//    }

    public FinanceDocument (int documentNumber, String date, int sum, String code) {
        super.setDocumentNumber(documentNumber);
        super.setDate(date);
        this.sum = sum;
        this.code = code;
    }

    @Override
    public void print() {
        System.out.println("This is finance document");
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
