
import java.io.*;

class CheckedExceptionExample {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
            BufferedReader fileInput = new BufferedReader(file);
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception caught");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
