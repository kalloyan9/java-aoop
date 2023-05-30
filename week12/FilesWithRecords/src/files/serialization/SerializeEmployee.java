package files.serialization;
import data.EmployeeRecord;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
    public static void main(String[] args)
    {
        // Create EmployeeRecord
        EmployeeRecord e1 = new EmployeeRecord
                (1l, "Lokesh", "Gupta", "howtodoinjava@gmail.com", 38);
        // Serialize EmployeeRecord
        writeToFile(e1, "employee1");
        // Deserialize EmployeeRecord
        System.out.println(readFromFile("employee1"));
    }

    static void writeToFile(EmployeeRecord obj, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(path))){
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static EmployeeRecord readFromFile(String path) {
        EmployeeRecord result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            result = (EmployeeRecord) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
