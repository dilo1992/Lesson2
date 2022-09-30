package by.teachmeskills.homework.lesson17;

import java.util.List;
import java.util.Optional;

public class Document {
    private List<String> documents;
    private Optional<String> phoneNumber;
    private Optional<String> email;

    public Document(List<String> documents, Optional<String> phoneNumber, Optional<String> email) {
        this.documents = documents;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public List<String> getDocuments() {
        return documents;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Optional<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documents=" + documents +
                ", phoneNumber=" + phoneNumber +
                ", email=" + email +
                '}';
    }
}
