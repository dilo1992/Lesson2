package by.teachmeskills.classwork.lesson18;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> opt;
        opt = Optional.of("here");
        opt = Optional.empty();
    }

    public static void printStrLength(String str) {
        Optional<String> nextOpt = Optional.ofNullable(str);
        nextOpt.ifPresent(val -> System.out.println(val.length()));
        nextOpt.orElseThrow();
        nextOpt.ifPresentOrElse(val -> System.out.println(val.length()), () -> System.out.println(0));
    }
}
