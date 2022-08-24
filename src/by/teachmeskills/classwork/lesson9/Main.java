package by.teachmeskills.classwork.lesson9;

public class Main {
    static {
        System.out.println("very first time");
    }

    public static void main(String[] args) {
        System.out.println("Here");
        addTree();
        Tree.printTreeCount();
        System.out.println();
        Garden garden = new Garden();
        System.out.println(garden.getTreeCount());
    }

    private static void addTree() {
        Tree tree = Tree.TreeHolder.getIstance();
        Tree.TREE_COUNT++;
    }

    private static void addTree2(){
        Tree tree = Tree.TreeHolder.getIstance();
        Tree.TREE_COUNT++;
    }

    static {
        System.out.println("we start doing it");
    }
}
