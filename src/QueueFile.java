import java.util.Deque;
import java.util.LinkedList;

public class QueueFile {
    public static void main(String[] args) {
        Deque<String> obj = new LinkedList<String>();

        obj.offer("RCB");
        obj.offer("MI");
        obj.offer("SRH");
        obj.offer("Kings XI");
        System.out.println(obj);  // [RCB, MI, SRH, Kings XI]

        obj.offerFirst("CSK");
        obj.offerLast("RR");
        System.out.println(obj);  // [CSK, RCB, MI, SRH, Kings XI, RR]

        obj.poll();
        System.out.println(obj);  // [RCB, MI, SRH, Kings XI, RR]

        obj.pollFirst();
        obj.pollLast();
        System.out.println(obj);   // [MI, SRH, Kings XI]

        System.out.println(obj.peek());     // MI
        System.out.println(obj.peekFirst());  // MI
        System.out.println(obj.peekLast());  // Kings XI
        System.out.println(obj);   // [MI, SRH, Kings XI]
    }
}
