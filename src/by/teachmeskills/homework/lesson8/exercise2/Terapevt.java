package by.teachmeskills.homework.lesson8.exercise2;

public class Terapevt extends Doctor {

    @Override
    public void heal(Client client) {
        System.out.println("I know how heal " + client.getName());
    }
}
