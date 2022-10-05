package by.teachmeskills.classwork.lesson19;

public class Counter {

    private Object lock = new Object();  //создаем объект, который работает как защелка
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() { //этим методом объединяем операцию, которая нам нужна, и применяем synchronized
        synchronized (lock) {
            setCount(getCount() + 1);
        }
        System.out.println("From there");
        System.out.println("and there");
    }

//    public synchronized int getCount() {  //synchronized говорит о том, что в этот метод может зайти только один поток,
//        // а второй будет ждать пока первый оттуда не выйдет
//        return count;
//    }
//
//    public synchronized void setCount(int count) {
//        this.count = count;
//    }
    //если использовать, например, synchronized в двух методах (сеттер и геттер),
    // то потоки будут занимать геттер один и сеттер другой и упрутся, не смогут дальше работать

}
