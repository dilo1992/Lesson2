package by.teachmeskills.homework.lesson7.exercise3;


public class SupplyContract extends Document implements Printable {
    private String type;
    private int quantity;

    public SupplyContract(int documentNumber, int year, int month, int dayOfMonth, String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
        super.setDocumentNumber(documentNumber);
        super.setDate(setYear(year), setMonth(month), setDayOfMonth(dayOfMonth));
    }

    @Override
    public void print() {
        System.out.println("This is supply contract.\n" + "Document number: " + getDocumentNumber() +
                " , date of create: " + super.getDate() + " , type: " + getType() + " , quantity: " + getQuantity());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
