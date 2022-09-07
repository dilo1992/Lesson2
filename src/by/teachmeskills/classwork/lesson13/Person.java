package by.teachmeskills.classwork.lesson13;

import java.util.Objects;

public class Person {
    private String passwordId;
    private String firstName;
    private String lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return passwordId.equals(person.passwordId) && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordId, firstName, lastName);
    }
}
