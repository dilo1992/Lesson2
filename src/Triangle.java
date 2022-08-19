public class Triangle extends Figure {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getArea() {
        return (int) 2 * getPerimeter() / c;
    }
}
