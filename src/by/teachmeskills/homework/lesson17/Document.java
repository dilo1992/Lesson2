package by.teachmeskills.homework.lesson17;

import java.util.List;
import java.util.Optional;

public class Document {
    private List<String> documentsNumber;
    private String phoneNumber;
    private String email;

    public Document() {
    }

    public Optional<String> getOptionalPhoneNumber() {
        return Optional.ofNullable(phoneNumber);
    }

    public Optional<String> getOptionalEmail() {
        //return Optional.of(nickname);
        return Optional.ofNullable(email);
    }

    public Document(List<String> documentsNumber, String phoneNumber, String email) {
        this.documentsNumber = documentsNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Document{" +
                "documentsNumbers=" + documentsNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public List<String> getDocumentsNumber() {
        return documentsNumber;
    }

    public void setDocumentsNumber(List<String> documentsNumber) {
        this.documentsNumber = documentsNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
