package by.teachmeskills.classwork.lesson19;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        //Хотим распечатать строчку с интервалом в 5 секунд
        System.out.println("first string");

        //Thread.currentThread().setName("First thread"); //Задаем имя для текущего потока. По умолчанию имя потока в методе main - main

        Thread.sleep(500); //время в миллисекундах (5000 мс = 5 секунд)
        System.out.println("second string");

        //Как получить текущий поток
        System.out.println(Thread.currentThread().getName()); //currentThread() - команда для текущего метода (дай мне текущий поток)

        //создаем экземпляры класса MyTestThread (нашего созданного) и запускаем их методом start() (создает поток и запускает метод run)
        MyTestThread testThread = new MyTestThread();
        MyTestThread testThread2 = new MyTestThread();
        MyTestThread testThread3 = new MyTestThread();

        //Потоки-демоны. Они выключают потоки немедленно, без ожидания освобождения потоков
        testThread.setDaemon(true);
        testThread2.setDaemon(true);
        testThread3.setDaemon(true);

        //Можно определить приоритет запуска потоков. Но это не панацея(потому что далеко не всегда соблюдается)
        testThread.setPriority(Thread.MAX_PRIORITY);
        testThread.start();

        //testThread.interrupt(); //Прерывание потока. Может возникнуть ошибка, если поток заснул после метода sleep,
        // а мы его в это время прервали, и он проснулся и не может понять, что происходит

        testThread2.setPriority(Thread.MIN_PRIORITY);
        testThread2.start();
        //testThread2.join();  //Этой строчкой мы определяем, что пока не закончится второй поток, третий не начнется. " ПОДОЖДЕМ ОКОНЧАНИЯ ВТОРОГО ПОТОКА"
        //testThread2.join(1);  //Определение времени, которое мы максимально можем ждать окончания потока. Если он не успеет закончиться, то идем дальше

        testThread3.setPriority(Thread.NORM_PRIORITY);
        testThread3.start();






    }
}
