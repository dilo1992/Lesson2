public class Triangle extends Figure {
    int a;
    int b;
    int c;
    int height;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    public Triangle(int c, int height) {
        this.c = c;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (int) 2 * getPerimeter() / c;
    }
}
