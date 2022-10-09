package by.teachmeskills.classwork.lesson18.samples_from_the_teacher;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLExample {
    public static void main(String[] args) throws Exception{
        JAXBContext contextObj = JAXBContext.newInstance(Question.class);

        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Answer ans1=new Answer(101,"java is a programming language","ravi");
        Answer ans2=new Answer(102,"java is a platform","john");

        List<Answer> list=new ArrayList<>();
        list.add(ans1);
        list.add(ans2);

        Question que=new Question(1,"What is java?",list);
        marshallerObj.marshal(que, new FileOutputStream("question.xml"));

    }
}
