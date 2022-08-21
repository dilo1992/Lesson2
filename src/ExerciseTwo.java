public class ExerciseTwo {
    public static void main(String[] args) {
        Computer computer1 = new Computer(200, "Helix");
        Computer computer2 = new Computer(100, "Shell", "DDR2", 20,
                "Lake", 200, "SuperType");

        computer1.printComp();
        computer2.printComp();
    }
}
