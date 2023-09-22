import java.io.*;

public class FileWriter{

    public static void main(String[] args) {
        try (BufferedWriter w = new BufferedWriter(new java.io.FileWriter("FileWriter.txt", true));
                BufferedReader r = new BufferedReader(new FileReader("FileWriter.txt"))) {

            w.write("\n" + "Hello Worls" + "\n");
            w.write("Hello Worlbadfdyabbfs");
            // w.close(); MA se w è nel try NO

            System.out.println();

            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
