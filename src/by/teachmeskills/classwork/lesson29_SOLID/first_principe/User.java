package by.teachmeskills.classwork.lesson29_SOLID.first_principe;

// �������� ��������� SOLID (����� S) � ������� ������ ���� ���� ���� -
// � ������ ������ user - ������� ������ �� ������� user
// ������� ��������� � ���� ������ ������� � ���� ������ ����� ��������� � ��������� ������

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


