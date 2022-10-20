package by.teachmeskills.homework.lesson18;

public class Lines {
    private String line;

    public Lines() {
    }

    public Lines(String line) {
        super();
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "line='" + line + '\'' +
                '}';
    }
}
