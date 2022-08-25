package by.teachmeskills.homework.lesson7.exercise3;

public class Register {
    private int position;
    private final Document[] arr;

    public Register(int size) {
        position = 0;
        arr = new Document[size];
    }

    /**
     * add document to our registry
     *
     * @param document - any type of ContractWithWorker
     */
    public void addDocument(Document document) {
        if (position < arr.length) {
            arr[position] = document;
            position++;
        }
    }

    /**
     * print all our filled of documents to console
     */
    public void print() {
        for (int i = 0; i < position; i++) {
            arr[i].print();
        }
    }
}