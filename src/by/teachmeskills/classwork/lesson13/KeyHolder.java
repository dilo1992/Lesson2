package by.teachmeskills.classwork.lesson13;

public class KeyHolder<T> { //T обозначает, что тут может быть любой класс
    private T value;

    public KeyHolder() {
    }

    public KeyHolder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
