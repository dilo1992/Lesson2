<<<<<<< HEAD
public class Triangle {

    //перечисляем три свойства класса и доступность (public, private)
    //public double a;
    //public double b;
    //public double c;
    private double a;
    private double b;
    private double c;
    private double coefficient;


    public Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public Triangle(double a, double b, double c) {
=======
public class Triangle extends Figure {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
>>>>>>> classwork/lesson-7
        this.a = a;
        this.b = b;
        this.c = c;
    }

<<<<<<< HEAD
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    /**
     * this is my supermethod
     *
     * @param coefficient - this is increases perimeter
     * @return super value with 2 signs
     */
    public double getMultiplyPerimeter(double coefficient) {
        this.coefficient = coefficient;
        return getPerimeter() * coefficient;
    }

    public double getA() {
        if (a < 0) {
            return 0;
        }
        return a;
    }

    public void setA(double a) {
        if (a < 0) {
            this.a = 0;
        } else {
            this.a = a;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", coefficient=" + coefficient +
                '}';
    }

    private void incrementA() {
        this.a++;
        this.b++;
        this.c++;
=======
    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getArea() {
        return (int) 2 * getPerimeter() / c;
>>>>>>> classwork/lesson-7
    }
}
