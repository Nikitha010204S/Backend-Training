package Day_14;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import java.io.File;

public class SAX_Parser extends DefaultHandler {
    public static void main(String[] args){
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SAX_Parser handler = new SAX_Parser();
            parser.parse(new File("D:\\Training_Backend\\src\\Day_14\\college.xml"), handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  @Override
    public void startDocument() throws SAXException {
        System.out.println("Starting Document");
  }
  @Override
    public void endDocument() throws SAXException {
        System.out.println("Ending Document");
  }
  @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Starting Element: " + qName);
  }
  @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("Ending Element: " + qName);
  }
  @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Characters: " + new String(ch, start, length));
  }
}
