package by.teachmeskills.classwork.lesson29_SOLID.fourth_principe;

public class Boeing2 implements Passengerable, SingleDriverVehicle {
    @Override
    public boolean isFlyable() {
        return true;
    }

    @Override
    public int getWeight() {
        return 10000;
    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public int getPassengersCount() {
        return 1000;
    }
}
