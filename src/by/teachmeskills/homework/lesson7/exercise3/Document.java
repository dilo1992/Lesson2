package by.teachmeskills.homework.lesson7.exercise3;

import java.time.LocalDate;

public abstract class Document implements Printable {
    private int documentNumber;
    private int year;
    private int month;
    private int dayOfMonth;
    private LocalDate date;

    public Document() {
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate setDate(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        date = LocalDate.of(year, month, dayOfMonth);
        return date;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        this.year = year;
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int setMonth(int month) {
        this.month = month;
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public int setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return dayOfMonth;
    }

}
