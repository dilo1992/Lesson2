package by.teachmeskills.classwork.lesson29_SOLID.first_principe;

// согласно принципам SOLID (буква S) у каждого класса есть одна цель -
// у нашего класса user - хранить данные об объекте user
// функции описанные в двух других методах в этом классе лучше размещать в отдельном классе

/**
 * this class is used for calculating some data related to month
 */
public class User {
    private String name;
    private int age;

    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}


