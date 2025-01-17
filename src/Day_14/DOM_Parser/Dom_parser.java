package Day_14.DOM_Parser;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Dom_parser {
    public static void main(String[] args) {
        try
        {
            DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=fact.newDocumentBuilder();
            Document rootDocument=builder.parse(new File("D:\\Training_Backend\\src\\Day_14\\SAX_Parser\\college.xml"));

            NodeList list2=rootDocument.getElementsByTagName("id");
            for(int i=0;i<list2.getLength();i++)
            {
                Node node=list2.item(i);
                System.out.println("Node Name: " + node.getNodeName());
                System.out.println("Node Value: " + node.getTextContent());
            }
            System.out.println();


            NodeList list=rootDocument.getElementsByTagName("name");
            for(int i=0;i<list.getLength();i++)
            {
                Node node=list.item(i);
                System.out.println("Node Name: " + node.getNodeName());
                System.out.println("Node Value: " + node.getTextContent());
            }
            System.out.println();
            NodeList list1=rootDocument.getElementsByTagName("department");
            for(int i=0;i<list1.getLength();i++)
            {
                Node node=list1.item(i);
                System.out.println("Node Name: " + node.getNodeName());
                System.out.println("Node Value: " + node.getTextContent());
            }


        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
