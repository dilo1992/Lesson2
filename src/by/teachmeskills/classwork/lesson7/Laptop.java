package by.teachmeskills.classwork.lesson7;

public class Laptop extends Computer {

    public Laptop(int BatteryLife) {
        super(); //super ��������� �� �����, ������� ��������� � ������-��������
        this.batteryLife = batteryLife;
    }

    int batteryLife;

    @Override
    public void setCost(int cost) {
        this.cost = cost + 5;
        //super.setCost(cost + 5);
    }

}
