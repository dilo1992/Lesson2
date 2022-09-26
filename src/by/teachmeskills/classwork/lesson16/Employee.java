package by.teachmeskills.classwork.lesson16;

public class Employee {
    private double salary;
    private String category;


    public Employee(double salary, String category) {
        this.salary = salary;
        this.category = category;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", category='" + category + '\'' +
                '}';
    }
}
