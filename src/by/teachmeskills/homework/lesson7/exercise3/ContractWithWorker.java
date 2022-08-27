package by.teachmeskills.homework.lesson7.exercise3;


import java.time.LocalDate;

public class ContractWithWorker extends Document implements Printable {
    private String name;
    private int endYear;
    private int endMonth;
    private int endDayOfMonth;
    private LocalDate contractEndDate;

    /**
     *
     * @param documentNumber - document number
     * @param year - a year when this document was done
     * @param month - a month when this document was done
     * @param dayOfMonth - a day when this document was done
     * @param endYear - a year when the contract with worker will be ended
     * @param endMonth - a month when the contract with worker will be ended
     * @param endDayOfMonth - a day when the contract with worker will be ended
     * @param name - the name of worker
     */
    public ContractWithWorker (int documentNumber, int year, int month, int dayOfMonth, int endYear,
                               int endMonth, int endDayOfMonth, String name) {
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.endDayOfMonth = endDayOfMonth;
        this.name = name;
        contractEndDate=LocalDate.of(endYear,endMonth,endDayOfMonth);
        super.setDocumentNumber(documentNumber);
        super.setDate(setYear(year), setMonth(month), setDayOfMonth(dayOfMonth));
    }

    @Override
    public void print() {
        System.out.println("This is contract with worker.\n" + "Document number: " + getDocumentNumber() +
                " , date of create: " + super.getDate() + " , name: " + getName() + " , contract end date : "
                + getContractEndDate());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }

    public int getEndDayOfMonth() {
        return endDayOfMonth;
    }

    public void setEndDayOfMonth(int endDayOfMonth) {
        this.endDayOfMonth = endDayOfMonth;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public LocalDate setContractEndDate(int endYear, int endMonth, int endDayOfMonth) {
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.endDayOfMonth = endDayOfMonth;
        contractEndDate = LocalDate.of(endYear, endMonth, endDayOfMonth);
        return contractEndDate;
    }
}
