package by.teachmeskills.classwork.lesson29_SOLID.fifth_principe;

import by.teachmeskills.classwork.lesson29_SOLID.fourth_principe.Bmw2;

public class MainT {
    public static void main(String[] args) {
        VehicleStore vehicleStore = new VehicleStore(new Bmw2());
        VehicleStore vehicleStore1 = new VehicleStore(new BmwX8());
        System.out.println(vehicleStore.getFilledMass());
        System.out.println(vehicleStore1.getFilledMass());
    }
}
