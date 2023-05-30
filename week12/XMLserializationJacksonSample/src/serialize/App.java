package serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class App {
    /**
     * This function writes serializes the Java object into XML and writes it
     * into an XML file.
     * XmlMapper
     * https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml/2.15.0
      * and dependencies core & databind
     * https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core
     * https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.15.0
     * https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.15.0
     * https://repo1.maven.org/maven2/org/codehaus/woodstox/stax2-api/4.2.1/
     */

    public static void serializeToXML() {
        try {
            XmlMapper xmlMapper = new XmlMapper();

            // serialize our Object into XML string
            String xmlString = xmlMapper.writeValueAsString(new PhoneDetails("OnePlus", "6.4", "6/64 GB"));
            //String xmlString = xmlMapper.writeValueAsString(new  Flower("some color",Color.PINK,2 ));
            // write to the console
            System.out.println(xmlString);

            // write XML string to file
            File xmlOutput = new File("serialized.xml");
            FileWriter fileWriter = new FileWriter(xmlOutput);
            fileWriter.write(xmlString);
            fileWriter.close();
        } catch (JsonProcessingException e) {
            // handle exception
        } catch (IOException e) {
            // handle exception
        }
    }
    public static void serializeToXMLwrapper() {
        try {
            XmlMapper xmlMapper = new XmlMapper();

            // serialize our Object into XML string
            String xmlString = xmlMapper.writeValueAsString(new Customer (1, "Peter Pan",
                    new Address[]{new Address("Sofia", "BG"), new Address("Taiwan", "Hong Kong")}));

            // write to the console
            System.out.println(xmlString);

            // write XML string to file
            File xmlOutput = new File("custoemrList.xml");
            FileWriter fileWriter = new FileWriter(xmlOutput);
            fileWriter.write(xmlString);
            fileWriter.close();
        } catch (JsonProcessingException e) {
            // handle exception
        } catch (IOException e) {
            // handle exception
        }
    }
    public static void serializeToJSON() {
        try {
            ObjectMapper jsontMapper = new ObjectMapper();

            // serialize our Object into XML string
            String xmlString = jsontMapper.writeValueAsString(new PhoneDetails("OnePlus", "6.4", "6/64 GB"));
            //String xmlString = xmlMapper.writeValueAsString(new  Flower("some color",Color.PINK,2 ));
            // write to the console
            System.out.println(xmlString);

            // write XML string to file
            File xmlOutput = new File("serialized.json");
            FileWriter fileWriter = new FileWriter(xmlOutput);
            fileWriter.write(xmlString);
            fileWriter.close();
        } catch (JsonProcessingException e) {
            // handle exception
        } catch (IOException e) {
            // handle exception
        }
    }
    public static void deserializeFromXML() {
        try {
            XmlMapper xmlMapper = new XmlMapper();

            // read file and put contents into the string
            String readContent = new String(Files.readAllBytes(Paths.get("serialized.xml")));

            // deserialize from the XML into a Phone object
            PhoneDetails deserializedData = xmlMapper.readValue(readContent, PhoneDetails.class);
          //  Flower deserializedData = xmlMapper.readValue(readContent, Flower.class);
            // Print object details
            System.out.println("Deserialized data: ");
             System.out.println( deserializedData);
            System.out.println("\tName: " + deserializedData.getName());
            System.out.println("\tMemory: " + deserializedData.getMemory());
            System.out.println("\tDisplay Size: " + deserializedData.getDisplaySize());
        } catch (IOException e) {
            // handle the exception
            System.out.println( e.getMessage());
        }
    }
    public static void deserializeFromXMLwrapper() {
        try {
            XmlMapper xmlMapper = new XmlMapper();

            // read file and put contents into the string
            String readContent = new String(Files.readAllBytes(Paths.get("customer.xml")));

            // deserialize from the XML into a Phone object
            Customer deserializedData = xmlMapper.readValue(readContent, Customer.class);
            //  Flower deserializedData = xmlMapper.readValue(readContent, Flower.class);
            // Print object details
            System.out.println("Deserialized data: ");
            System.out.println( deserializedData);
            System.out.println("\tId: " + deserializedData.getId());
            System.out.println("\tAddresses: " + Arrays.toString(deserializedData.getAddress()));

        } catch (IOException e) {
            // handle the exception
            System.out.println( e.getMessage());
        }
    }
    public static void deserializeFromJSON() {
        try {
            ObjectMapper jsonMapper = new ObjectMapper();

            // read file and put contents into the string
            String readContent = new String(Files.readAllBytes(Paths.get("serialized.json")));

            // deserialize from the XML into a Phone object
            PhoneDetails deserializedData = jsonMapper.readValue(readContent, PhoneDetails.class);
            //  Flower deserializedData = xmlMapper.readValue(readContent, Flower.class);
            // Print object details
            System.out.println("Deserialized data: ");
            System.out.println( deserializedData);
            System.out.println("\tName: " + deserializedData.getName());
            System.out.println("\tMemory: " + deserializedData.getMemory());
            System.out.println("\tDisplay Size: " + deserializedData.getDisplaySize());
        } catch (IOException e) {
            // handle the exception
            System.out.println( e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("Serializing to XML...");
        serializeToXML();
        serializeToJSON();
        serializeToXMLwrapper();
        System.out.println("Deserializing from XML...");
        deserializeFromXML();
        deserializeFromJSON();
        System.out.println("Deserializing from XML wrapper...");
        deserializeFromXMLwrapper();
    }
}
