package by.teachmeskills.classwork.lesson29_SOLID.fourth_principe;

public class Main {
    public static void main(String[] args) {
        //��� ��� �������, ������� ��������� �������� �� �����
        SingleDriverVehicle vehicle = new Boeing2();
        Passengerable passengerable = (Passengerable) vehicle;

    }
}
