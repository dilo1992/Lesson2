import java.util.Random;
import java.util.Scanner;


//Написать программу которая загадывает число и
//предлагает вам его угадать (можно указать максимальное количество попыток).


    public class Guess {
        public static void main(String[] args) {
            for(int i=1;i<=10;i++){
                int randomValue=new Random().nextInt(0,20);
                System.out.print("Guess a number from 0 to 20 " +
                    "limited for 10 values. Attemps "+i+": ");
                Scanner scanner=new Scanner(System.in);
                int number=scanner.nextInt();
                if (number<0 || number>20){
                    System.out.println("Number is not in range"); return;
                } if (number==randomValue) {
                    System.out.println("You guessed! The number is " + randomValue); break;
                } else if (number>randomValue){
                    System.out.println("The given number is greater than the entered number");
                } else {
                    System.out.println("The given number is less than the entered number");
                }
            }
        }
    }