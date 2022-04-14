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

        TreeSet<String> obj = new TreeSet<String>();
        obj.add("RCB");
        obj.add("Mumbai Indians");
        obj.add("KKR");
        obj.add("Kings XI");
        obj.add("Kings XI");

        if(!obj.contains("SRH")) {
            obj.add("SRH");
        }

        System.out.println("is TreeSet Empty...? " + obj.isEmpty());
        System.out.println("Elements are: " + obj);

        obj.remove("RCB");
        System.out.println("First element is : " + obj.first());
        System.out.println("Last element is : " + obj.last());
        System.out.println("Size of TreeSet is : " + obj.size());

        Iterator<String> itr2 = obj.iterator();
        while(itr2.hasNext())  {
            System.out.println(itr2.next());
        }
        obj.clear();
        System.out.println("Final TreeSet is Empty...? " + obj.isEmpty());
    }
}
