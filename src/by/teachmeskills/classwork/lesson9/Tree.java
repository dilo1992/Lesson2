package by.teachmeskills.classwork.lesson9;

public class Tree {
    public static int TREE_COUNT = 0;
    private String treeName = "tree";

    public static void printTreeCount() {
        System.out.println(TREE_COUNT);
        //System.out.println(treeName); - нельзя, потому что в статик блоке видит только статик переменные
    }

    public Tree() {
        TREE_COUNT++;
    }

    public String getTreeName() {
        return treeName + TREE_COUNT;
    }

    public static class TreeHolder {
        public static final Tree INSTANCE = new Tree();

        public static Tree getIstance() {
            return INSTANCE;
        }
    }
}