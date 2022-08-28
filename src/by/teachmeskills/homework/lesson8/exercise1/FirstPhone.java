package by.teachmeskills.homework.lesson8.exercise1;

public class FirstPhone extends Phone implements Printable {
    private int number = 1;
    private String model = "iPhone";
    private String name = "Pyotr";

    @Override
    public void print(){
        System.out.println("Number: "+getNumber()+", model: "+getModel()+ " ,name: "+ getCallerName());
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
    public String getCallerName() {
        return name;
    }

    @Override
    public void setCallerName(String callerName) {
        this.name = callerName;
    }
}
