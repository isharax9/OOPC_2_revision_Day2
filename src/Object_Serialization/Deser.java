package Object_Serialization;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

class DeserializationExample {

    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("person.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Person person = (Person) in.readObject();
            System.out.println("Deserialized Person...");
            System.out.println("Name: " + person.name);
            System.out.println("Age: " + person.age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
