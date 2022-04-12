import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileIOBasic {
    public static void main(String[] args) {
        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("myfile.txt");
            String s = "dkfjgskld";
            fout.write(s.getBytes(StandardCharsets.UTF_8));
            fout.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error File not found");
        } catch(IOException e) {
            System.out.println("IOException");
        }finally {
            if(fout != null) {
                try {
                    fout.close();
                } catch(IOException e) {
                    System.out.println("IOException occurred");
                }
            }
        }

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("myfile.txt");
            System.out.println((char)fin.read());
            System.out.println((char)fin.read());

            byte[] b = fin.readAllBytes();
            String s = new String(b);

            System.out.println(s);
        } catch(FileNotFoundException e) {
            System.out.println("File not found...");
        } catch(IOException e) {
            System.out.println("IOException occurred...");
        }
    }
}
