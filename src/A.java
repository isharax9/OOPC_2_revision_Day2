
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class A implements Serializable {

    int i = 10;
    int j = 20;
}

class Test {

    public static void main(String[] args) {
        try {
            File f = new File("A.ser");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            A a = (A) ois.readObject();
            System.out.println(a.i);
            System.out.println(a.j);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
