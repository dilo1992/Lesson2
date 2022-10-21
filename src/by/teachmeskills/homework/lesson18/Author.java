package by.teachmeskills.homework.lesson18;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Author {

    private String lastName;
    private String firstName;
    private String nationality;
    private int yearOfBirth;
    private int yearOfDeath;

    public Author() {
    }

    public Author(String lastName, String firstName, String nationality, int yearOfBirth, int yearOfDeath) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
        this.yearOfDeath = yearOfDeath;
    }

    @XmlElement
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @XmlElement
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @XmlElement
    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfDeath=" + yearOfDeath +
                '}';
    }
}
