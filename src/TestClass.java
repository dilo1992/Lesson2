public class TestClass {
    public static void main(String[] args) {
        /*PK c=new PK();
        c.setCost(10);
        System.out.println(c.getCost());
        Laptop l=new Laptop(5);
        l.setCost(10);
        System.out.println(l.getCost());

        Flyable[] arr2=new Flyable[3];
        arr2[0]=new Airplane();
        arr2[1]=new Ball();
        arr2[2]=new Bird();
        for (Flyable el:arr2){
            el.fly();*/
    /*    }*/
        Figure circle=new Circle(3);
        Figure square=new Square(3);
        Figure triangle=new Triangle(3,2,4);
        Figure[] arr3=new Figure[3];
        arr3[0]=circle;
        arr3[1]=square;
        arr3[2]=triangle;
        for(Figure figure:arr3){
            System.out.println(figure.getPerimeter());
        }
    }
}
