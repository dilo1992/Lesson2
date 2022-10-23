package by.teachmeskills.homework.lesson19;

public class RunnableClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

        }
        System.out.println("thread: " + Thread.currentThread().getName());
    }
}
