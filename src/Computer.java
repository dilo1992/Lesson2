public abstract class Computer { //abstract - если не хотим, чтоб дальше можно было использовать класс Computer
    int batteryLife;
    String model;
    protected int cost;
    int screenSize;

    public Computer(){
    }

    public Computer(String model) {
        cost=100;
        this.model=model;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
