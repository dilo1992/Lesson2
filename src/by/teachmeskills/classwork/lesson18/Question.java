package by.teachmeskills.classwork.lesson18;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Question {

    private int id;
    private String questionname;
    private List<Answer> answers;

    public Question() {
    }

    public Question(int id, String questionname, List<Answer> answers) {
        this.id = id;
        this.questionname = questionname;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
