import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        Figure circle = new Circle(3);
        Figure square = new Square(3);
        Figure triangle = new Triangle(3, 2, 4);
        Figure[] arr3 = new Figure[5];
        arr3[0] = circle;
        arr3[1] = square;
        arr3[2] = triangle;
        arr3[3] = circle;
        arr3[4] = square;
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum += arr3[i].getPerimeter();
        }
        System.out.println("The summary perimeter of figure in the array is " + sum + " square millimeters");
    }
}
