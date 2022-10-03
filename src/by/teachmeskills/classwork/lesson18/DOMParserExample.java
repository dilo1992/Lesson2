package by.teachmeskills.classwork.lesson18;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParserExample {
    public static void main(String[] args) {
        try {
            File inputFile = new File("class.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();  //запомнить, так делается
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder(); //запомнить, так делается
            Document doc = dBuilder.parse(inputFile); //собирает все элементы файла xml и размещает в Document
            doc.getDocumentElement().normalize(); //структурирует в структуру Дерево
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            //по выполнению данного кода выведет Root element: class. class - это верхний
            // элемент из файла xml, который мы создали в корне проекта

            System.out.println("------------------------------");
            //говорим: найди нам всех студентов. Node - это все ветки дерева, каждый из объектов
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println(nList.getLength());

            //получим атрибуты документа
            for(int i=0;i< nList.getLength();i++) {
                Node current = nList.item(i);
                System.out.println("Element: "+current.getNodeName()); //getNodeName() возвращает название тега
                Element element = (Element) current;
                System.out.println(element.getAttribute("rollno")+" "+element.getAttribute("first"));

                System.out.println(element.getElementsByTagName("firstname").item(0).getTextContent());
                //берем элемент, знаем, что у нашего объекта есть firstname, командой item(0) берем
                // первое поле (нулевое, это для того, если их было бы много с одним именем firstname, то указывали бы какие брать))
            }




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
