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
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();  //���������, ��� ��������
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder(); //���������, ��� ��������
            Document doc = dBuilder.parse(inputFile); //�������� ��� �������� ����� xml � ��������� � Document
            doc.getDocumentElement().normalize(); //������������� � ��������� ������
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            //�� ���������� ������� ���� ������� Root element: class. class - ��� �������
            // ������� �� ����� xml, ������� �� ������� � ����� �������

            System.out.println("------------------------------");
            //�������: ����� ��� ���� ���������. Node - ��� ��� ����� ������, ������ �� ��������
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println(nList.getLength());

            //������� �������� ���������
            for(int i=0;i< nList.getLength();i++) {
                Node current = nList.item(i);
                System.out.println("Element: "+current.getNodeName()); //getNodeName() ���������� �������� ����
                Element element = (Element) current;
                System.out.println(element.getAttribute("rollno")+" "+element.getAttribute("first"));

                System.out.println(element.getElementsByTagName("firstname").item(0).getTextContent());
                //����� �������, �����, ��� � ������ ������� ���� firstname, �������� item(0) �����
                // ������ ���� (�������, ��� ��� ����, ���� �� ���� �� ����� � ����� ������ firstname, �� ��������� �� ����� �����))
            }




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
