package serialization_and_deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws Exception {
        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("kiran");
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Chinmayi.M.N\\Documents\\serialization and deserialization\\serialized.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
