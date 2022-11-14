package by.teachmeskills.classwork.lesson29_SOLID.fifth_principe;

import by.teachmeskills.classwork.lesson29_SOLID.fourth_principe.Bmw2;
import by.teachmeskills.classwork.lesson29_SOLID.fourth_principe.SingleDriverVehicle;

public class VehicleStore {
    //private Bmw2 bmw;
    //чтоб не нужно было при замене объекта все менять можно указать как тип объекта интерфейс
    private SingleDriverVehicle vehicle;

    public VehicleStore(SingleDriverVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getFilledMass() {
        return vehicle.getWeight();
    }
}
