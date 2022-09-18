package by.teachmeskills.classwork.lesson15;

import java.util.Optional;

public class Person {
    private String nickname;
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age=age;
        this.name=name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Optional<String> getOptionalNickname(){
        //return Optional.of(nickname);
        return Optional.ofNullable(nickname);//лучше использовать эту версию
    }
}
