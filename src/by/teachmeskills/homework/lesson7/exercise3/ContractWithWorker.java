package by.teachmeskills.homework.lesson7.exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ContractWithWorker extends Document implements Printable {
    private String name;
    private Calendar endOfConract = new GregorianCalendar();

    public ContractWithWorker() {
    }

    public void ContractWithWorker(int documentNumber, Calendar calendar, String name, Calendar endOfConract) {
        super.setDocumentNumber(documentNumber);
        super.setCalendar(calendar);
        this.name = name;
        this.endOfConract = endOfConract;
    }

    @Override
    public void print() {
        System.out.println("This is contract with worker " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getEndOfConract() {
        return endOfConract;
    }

    public void setEndOfConract(Calendar endOfConract) {
        this.endOfConract = endOfConract;
    }
}
