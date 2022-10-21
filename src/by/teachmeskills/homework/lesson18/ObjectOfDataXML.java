package by.teachmeskills.homework.lesson18;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="sonnet")
public class ObjectOfDataXML {


    private String type;

    private Author author;

    private String title;

    private Lines lines;

    public ObjectOfDataXML() {
    }


    public ObjectOfDataXML(Author author, String title, Lines lines) {
        super();
        this.author = author;
        this.title = title;
        this.lines = lines;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Lines getLines() {
        return lines;
    }

    public void setLines(Lines lines) {
        this.lines = lines;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ObjectOfDataXML{" +
                "type='" + type + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", lines=" + lines +
                '}';
    }
}
