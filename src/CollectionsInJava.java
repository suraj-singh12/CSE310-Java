import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionsInJava {
//    it is a framework that provides an architecture to store and manipulate the "group of objects".
//    only objects can be stored, not primitives, to store primitives, you need to use wrapper classes.
//    like convert int var to Integer, to store an int.
//    it is like STL of C++
    /*
    "Collection"        (interface)
    interfaces: set, list, queue            [remember this (important)]
    abstract classes:
    concrete classes: TreeSet, HashSet, Vector, ArrayList, LinkedList, PriorityQueue and much more...
     */
    public static void main(String[] args) {
        // ArrayList : it is like vector of C++
        // default capacity (initial): 10
        // default capacity of StringBuffer: 16

        /*
        ArrayList() : default initial capacity 10
        ArrayList(int capacity)
        ArrayList(Collection c) : Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
         */
        ArrayList<Integer> obj = new ArrayList<Integer>();
//        obj.set(0, 23);   // autoboxing (since it only supports objects as said above) [    => obj.set(0, new Integer(23));    ]
//        obj.set(1, 25);

        ArrayList<String> obj1 = new ArrayList<String>();
        obj1.add("India"); obj1.add("Pakistan");

        ArrayList<String> obj2 = new ArrayList<String>(5);
        obj2.add("Russia");
        System.out.println(obj2);

        obj2.addAll(obj1);
        System.out.println(obj2);

        obj2.add(0, "Israel");
        System.out.println(obj2);

        obj2.remove(2);
        System.out.println(obj2);
    }
}
