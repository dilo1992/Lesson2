package by.teachmeskills.homework.lesson8.exercise1;

public abstract class Phone implements Printable {
    private int number;
    private String model;
    private int weight;
    private String name;

    public void recieveCall (String name) {
        this.name = name;
        System.out.println("Called {"+name+" }");
    }

    public void recieveCall(String name, int number){
        this.name = name;
        this.number = number;
        System.out.println("Called {"+name+" } "+number);
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
