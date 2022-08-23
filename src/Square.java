public class Square extends Figure {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int getPerimeter() {
        return 4 * a;
    }

    @Override
    public int getArea(){
        return (int) Math.sqrt(a);
    }
}