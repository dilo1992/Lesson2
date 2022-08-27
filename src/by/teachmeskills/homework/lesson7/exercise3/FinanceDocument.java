package by.teachmeskills.homework.lesson7.exercise3;

public class FinanceDocument extends Document implements Printable {
    private int sum;
    private String code;

    public FinanceDocument (int documentNumber, int year, int month, int dayOfMonth, int sum, String code) {
        this.sum = sum;
        this.code = code;
        super.setDocumentNumber(documentNumber);
        super.setDate(setYear(year), setMonth(month), setDayOfMonth(dayOfMonth));
    }

    @Override
    public void print() {
        System.out.println("This is finance document.\n" + "Document number: " + getDocumentNumber() +
                " , date of create: " + super.getDate() + " , mounthly total sum: " + getSum() + " , department code: " + getCode());
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
