package by.teachmeskills.classwork.lesson13;

import by.teachmeskills.homework.lesson8.exercise2.Doctor;

public class DoctorHolder<T extends Doctor> { //Т может быть любым классом из наследников класса Doctor, который мы делали ранее
    T value;

    public DoctorHolder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
