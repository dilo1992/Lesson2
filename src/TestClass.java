public class TestClass {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Triangle t1 = new Triangle(3, 4, 5);
        //t.a = 3;
        //t.b = 5;
        //t.c = 4;
        //System.out.println(t.a);
        //System.out.println(t1.b);
        System.out.println(t.getPerimeter());
        System.out.println(t.getMultiplyPerimeter(0.5));
        System.out.println(t.getA());
        System.out.println(t);
    }
}

