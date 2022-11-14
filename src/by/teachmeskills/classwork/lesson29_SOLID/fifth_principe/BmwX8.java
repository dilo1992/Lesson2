package by.teachmeskills.classwork.lesson29_SOLID.fifth_principe;

import by.teachmeskills.classwork.lesson29_SOLID.fourth_principe.SingleDriverVehicle;

public class BmwX8 implements SingleDriverVehicle {
    @Override
    public boolean isFlyable() {
        return false;
    }

    @Override
    public int getWeight() {
        return 1000;
    }

    @Override
    public String getColour() {
        return null;
    }
}
