package by.teachmeskills.homework.lesson8;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //добавление заполненных клентов
        Client[] clients = getClients();

        for (Client client1: clients) {
            //определение необходимого доктора
            Doctor doctor = DoctorFactory.getDoctorByMedicalPlan(client1.getMedicalPlan());
            //необходимое лечение
            doctor.heal(client1);
        }

        //Doctor doctor = DoctorFactory.getDoctorByMedicalPlan(client.getMedicalPlan());
        //doctor.heal(client);
    }

    private static Client[] getClients() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set clients size: ");
        int size = scanner.nextInt();
        Client[] clients = new Client[size];
        for (int i=0; i<size; i++) {
            clients[i] = getClient();
        }
        return clients;
    }

    private static Client getClient() {
        Random r = new Random();
        int nextValue = r.nextInt(4);
        Client client = new Client("Fedor"+nextValue);
        MedicalPlan medicalPlan=new MedicalPlan(nextValue);
        client.setMedicalPlan(medicalPlan);
        //client.setMedicalPlan(new MedicalPlan(1)); - можем вместо двух строчек выше записать так
        return client;
    }
}
