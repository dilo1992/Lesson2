package by.teachmeskills.homework.lesson18;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

public class Lines {

    private String[] line;

    public Lines() {
    }

    @XmlElement(name="line")
    public String[] getLine() {
        return line;
    }

    public void setLine(String[] line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "line=" + Arrays.toString(line) +
                '}';
    }
}
