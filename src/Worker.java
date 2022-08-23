public class Worker implements Workable {
    String worker = "worker";

    public Worker() {
        this.worker = worker;
    }

    @Override
    public void work() {
        System.out.println("He/She is " + this.worker);
    }
}
