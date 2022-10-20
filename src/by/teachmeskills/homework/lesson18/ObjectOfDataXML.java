package by.teachmeskills.homework.lesson18;

public class ObjectOfDataXML {
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

    @Override
    public String toString() {
        return "ObjectOfDataXML{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", lines=" + lines +
                '}';
    }
}
