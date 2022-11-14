package by.teachmeskills.classwork.lesson29_SOLID.third_principe;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Boeing();
        if (vehicle.isFlyable()) {
            System.out.println("this vehicle is flying and has " + vehicle.getWeight() + " mass");
        } else {
            System.out.println("this vehicle is not flying and has " + vehicle.getWeight() + " mass");
        }
    }
}
