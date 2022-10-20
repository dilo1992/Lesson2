package by.teachmeskills.homework.lesson18;

import by.teachmeskills.classwork.lesson18.samples_from_the_teacher.Answer;
import by.teachmeskills.classwork.lesson18.samples_from_the_teacher.Question;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class ExerciseJAXBToObject {
    public static void main(String[] args) throws JAXBException {
        File file = new File("SchemaForHW18.xsd.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectOfDataXML.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        ObjectOfDataXML object = (ObjectOfDataXML) jaxbUnmarshaller.unmarshal(file);

        System.out.println(object.toString());

    }
}
