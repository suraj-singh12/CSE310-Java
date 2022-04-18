import org.w3c.dom.css.Rect;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class ComparatorInterface {
    public static void main(String[] args) {
        Set<Rectangle> set = new TreeSet<Rectangle>(new RectangleComparator());
        // since we are implementing comparison logic in different class 'RectangleComparator'
        // so we need to pass this information in the constructor of TreeSet, otherwise
        // it will think, that the compare logic is present in the `Rectangle` class itself
        // and will crash when it does not find the logic there.

        set.add(new Rectangle(4,4));
        set.add(new Rectangle(4,4));
        set.add(new Rectangle(8,4));
        set.add(new Rectangle(9,4));
        set.add(new Rectangle(6,4));
        set.add(new Rectangle(2,4));

        System.out.println("Printing Elements in Sorted Sequence");
        int k = 1;
        for(Rectangle i : set) {
            System.out.println("Perimeter of Rectangle " + k + " is " + i.perimeter());
            k++;
        }
    }
}
class Rectangle {
    int length, breadth;
    Rectangle(int x, int y) {
        length = x;
        breadth = y;
    }
    int area() {
        return length * breadth;
    }
    int perimeter() {
        return 2 * (length + breadth);
    }
}

/*
why implement comparison logic?
so that we can insert our custom objects in ArrayList
 */
// implementing custom Comparator
/*
The only difference between comparable interface, and comparator interface is that
the comparator allows us to put the comparison logic in separate class, so it takes 2 args
while comparable interface says put the comparison logic in same class, it takes 1 arg only,
other object is the caller of that comparator fn so not needed to provide explicitly
 */
class RectangleComparator implements Comparator<Rectangle> {
    public int compare(Rectangle x, Rectangle y) {
        int perimeter1 = x.perimeter();
        int perimeter2 = y.perimeter();

        if(perimeter1 < perimeter2) {
            return +1;
        } else if(perimeter1 > perimeter2) {
            return -1;
        } else return 0;
    }
}