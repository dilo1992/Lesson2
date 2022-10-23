package by.teachmeskills.homework.lesson19;

public class RunThreadsWithJoin {
    public static void main(String[] args) {
        RunnableClass runnable = new RunnableClass();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t3.start();
        try {
            t3.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t1.start();
        try {
            t1.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
