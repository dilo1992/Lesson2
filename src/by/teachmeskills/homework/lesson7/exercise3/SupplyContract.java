package by.teachmeskills.homework.lesson7.exercise3;

import java.util.Calendar;

public class SupplyContract extends Document implements Printable {
    private String type;
    private int quantity;

//    public SupplyContract() {
//    }

    public SupplyContract(int documentNumber, Calendar calendar, String type, int quantity) {
        super.setDocumentNumber(documentNumber);
        //super.setCalendar(calendar);
        this.type = type;
        this.quantity = quantity;
    }

    @Override
    public void print() {
        System.out.println("This is supply contract");
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
