import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFile {
    public static void main(String[] args) {
        ArrayList<String> obj1 = new ArrayList<>();
//        System.out.println(obj1);
        obj1.add("India");
        obj1.add("Pakistan");
        obj1.add("Russia");

        if(obj1.contains("Pakistan")) {
            obj1.remove("Pakistan");
        }
        System.out.println(obj1);
        System.out.println(obj1.indexOf("India"));
        System.out.println(obj1.get(1));
        System.out.println(obj1.size());

        ArrayList<String> obj2;
        if(obj1.size() != 0) {
            obj2 = (ArrayList) obj1.clone();    // obj1.clone() will return ref variable of Object class,
            // that's why we are typecasting it to ArrayList
            System.out.println(obj2);
        }
    }
}
