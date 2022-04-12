import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetFile {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("KingsXII");
        tree.add("Hello");
        tree.add("Java");
        tree.add("Main");
        tree.add("Java");  // duplicates are not added

        System.out.println(tree);
        Iterator<String> itr = tree.iterator(); // returns an iterator over the
        // elements in this set in ascending order.
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
