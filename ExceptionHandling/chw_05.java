
import java.io.*;

class chw_05 {

    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        System.out.println("File opened successfully");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found or cannot be read");
        }
    }
}
