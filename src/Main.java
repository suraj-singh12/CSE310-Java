import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        byte[] arr = {'a','c','d','c'};
//        System.out.println(new String(arr));
////        System.out.println(Arrays.toString(arr));
//        String str = new String(arr);
//        System.out.println(Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("C:/Users/suraj/Desktop/FileTesting.txt", true);
            String data = "This is new Data";
            byte[] bytesArr = data.getBytes(StandardCharsets.UTF_8);
            fout.write(bytesArr);
            fout.close();

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            fout.close();
        }
    }
}
