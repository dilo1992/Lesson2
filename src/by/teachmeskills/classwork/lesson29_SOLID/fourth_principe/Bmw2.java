package by.teachmeskills.classwork.lesson29_SOLID.fourth_principe;

public class Bmw2 implements Passengerable, SingleDriverVehicle {

    @Override
    public boolean isFlyable() {
        return false;
    }

    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public int getPassengersCount() {
        return 0;
    }
}
