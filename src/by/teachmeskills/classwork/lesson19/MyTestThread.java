package by.teachmeskills.classwork.lesson19;

public class MyTestThread extends Thread {
    //дл€ работы в режиме многопоточности необходимо наследоватьс€ от класса Thread
    //работа в новом потоке должна выполн€тьс€ ќЅя«ј“≈Ћ№Ќќ в методе run()
    //оптимальное количество потоков примерно определено  оличество потоков (€дер) CPU +1


    //дл€ генерации этого переопределенного метода вызываетс€ так же, как и конструктор,
    //геттер-сеттер из меню override methods
    @Override
    public void run() {
        //super.run(); //это дл€ запуска дефолтной реализации метода run(), определенной изначально Java

        //задаем им€ дл€ нашего потока
        //this.setName("My super thread");

        System.out.println("Our thread started: " + this.getName());  //this.getName() - это метод этого класса

        //определ€ем врем€ дл€ выполнени€ метода
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.println("Our thread finished: " + this.getName());
    }


}
