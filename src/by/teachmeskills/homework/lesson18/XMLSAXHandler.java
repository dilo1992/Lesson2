package by.teachmeskills.homework.lesson18;

import by.teachmeskills.classwork.lesson18.Article;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class XMLSAXHandler extends DefaultHandler {
    private static final String LINES = "lines";
    private static final String LINE = "line";


    private ArrayList<String> listWithText;
    private StringBuilder elementValue;


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length);
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case LINES:
                listWithText = new ArrayList<>();
                break;
            case LINE:
                elementValue = new StringBuilder();
                break;
        }
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (LINE.equals(qName)) {
            listWithText.add(String.valueOf(elementValue));
        }
    }

    public ArrayList<String> getListWithText() {
        return listWithText;
    }

    @Override
    public String toString() {
        return "XMLSAXHandler{" +
                "listWithText=" + listWithText +
                '}';
    }
}
