package by.teachmeskills.homework.lesson18;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExerciseJAXBToObject {
    public static void main(String[] args) throws JAXBException {
        try {
            File file = new File("data.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectOfDataXML.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ObjectOfDataXML object = (ObjectOfDataXML) jaxbUnmarshaller.unmarshal(file);
            System.out.println(object.toString());

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, new FileOutputStream("myFirstMarshal.xml"));

        } catch (IllegalArgumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
