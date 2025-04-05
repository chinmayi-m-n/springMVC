package serialization_and_deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public interface Deserialization {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Chinmayi.M.N\\Documents\\serialization and deserialization\\serialized.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Employee employee=(Employee)objectInputStream.readObject();
        System.out.println(employee.getId()+" "+employee.getName());
    }
}
