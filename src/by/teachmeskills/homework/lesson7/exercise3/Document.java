package by.teachmeskills.homework.lesson7.exercise3;

import java.text.SimpleDateFormat;

public abstract class Document implements Printable {
    private int documentNumber;
    private SimpleDateFormat date;

    public Document() {
        this.documentNumber = documentNumber;
        this.date = new SimpleDateFormat("dd-MM-yyyy");
    }

//    public Document(int documentNumber, Calendar calendar) {
//        this.documentNumber = documentNumber;
//        this.calendar = calendar;
//    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
