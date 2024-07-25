package Object_Serialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

    //private static final long serialVersionUID = 1L; // Recommended for Serializable classes
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class SerializationExample {

    public static void main(String[] args) {
        Person person = new Person("Ishsffara", 283);

        try (FileOutputStream fileOut = new FileOutputStream("person.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
