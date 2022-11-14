package by.teachmeskills.classwork.lesson29_SOLID.third_principe;

public class Boeing implements Vehicle {
    @Override
    public boolean isFlyable() {
        return true;
    }

    @Override
    public int getWeight() {
        return 10000;
    }
}
