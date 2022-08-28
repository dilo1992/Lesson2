package by.teachmeskills.homework.lesson8.exercise1;

import java.util.Arrays;

public abstract class Phone implements Printable {
    private int number;
    private String model;
    private int weight;
    private String callerName;
    private int callerNumber;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public void recieveCall (String callerName) {
        this.callerName = callerName;
        System.out.println("Called {"+callerName+"}");
    }

    public void recieveCall(String callerName, int callerNumber){
        this.callerName = callerName;
        this.callerNumber = callerNumber;
        System.out.println("Called {"+callerName+"} "+"number "+callerNumber);
    }

    public void sendMessage(int...numbers){
        System.out.println("Called numbers: "+Arrays.toString(numbers));
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public int getCallerNumber() {
        return callerNumber;
    }

    public void setCallerNumber(int callerNumber) {
        this.callerNumber = callerNumber;
    }
}
