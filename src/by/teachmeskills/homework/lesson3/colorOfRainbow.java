//По введенному номеру определить цвет радуги (1 - красный,
//4 – зеленый и т. д.). Это задание лучше делать через switch,
// метод задания числа выберите самостоятельно.

import java.util.Scanner;

public class colorOfRainbow {
    public static void main(String[] args) {
        System.out.print ("Enter the number a color of the colorarc (1...7): ");
        Scanner scanner = new Scanner(System.in);
        int color = scanner.nextInt();
        switch (color) {
            case 1:
                System.out.println("Number 1 is red color"); break;
            case 2:
                System.out.println("Number 1 is orange color"); break;
            case 3:
                System.out.println("Number 1 is yellow color"); break;
            case 4:
                System.out.println("Number 1 is green color"); break;
            case 5:
                System.out.println("Number 1 is blue color"); break;
            case 6:
                System.out.println("Number 1 is dark blue color"); break;
            case 7:
                System.out.println("Number 1 is purple color"); break;
        }
    }
}
