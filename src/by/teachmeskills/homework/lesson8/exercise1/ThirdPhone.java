package by.teachmeskills.homework.lesson8.exercise1;

public class ThirdPhone extends Phone implements Printable{
    private int number = 3;
    private String model = "Xiaomi";
    private String name = "David";

    @Override
    public void print(){
        System.out.println("Number: "+getNumber()+", model: "+getModel()+ " ,name: "+getName());
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
