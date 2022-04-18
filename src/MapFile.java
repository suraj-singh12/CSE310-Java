import java.util.HashMap;
import java.util.Map;

public class MapFile {
    /*
    Map: optimizes searching
    it is a container that stores the element along with the keys.
    the keys are like indexes.
    A map cannot contain duplicate keys. Each key maps to one value.
    key : value

    Map (interface) <- AbstractMap implements <- Hashmap extends

    map can have only 1 null key,
    but corresponding to any key multiple values can be null.

    the hashmap maintains no order of keeping the elements.
     */
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        HashMap<Integer, String> obj = new HashMap<>();
        obj.put(25, "Vineet");
        obj.put(26, "Aashi");
        obj.put(32, "Aashish");

        System.out.println(obj.entrySet());
        // entrySet() method fetches all the key : value pairs
        System.out.println(obj.keySet());
        System.out.println(obj.values());

        System.out.println(obj);
        obj.remove(25);   // this key exists, it will remove
        obj.remove(15);   // this key does not exist, so nothing will happen
        System.out.println(obj);

        if(obj.containsKey(32)) {
            System.out.println(obj.get(32));
        }
        if(obj.containsValue("Aashish")) {
            System.out.println("Value Aashish is there");
        }
        // find and replace the record if it is there
        if(obj.containsKey(32)) {
            obj.put(32, "Amit");
        }
        obj.remove(32);    // remove key 32 from map
        System.out.println(obj);
        System.out.println("Size of HashMap is : " + obj.size());
        obj.clear();  // wipe out all data in the hashmap
        System.out.println("HashMap is empty...? " + obj.isEmpty());
    }
}
