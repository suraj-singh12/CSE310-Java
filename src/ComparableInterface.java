import java.util.TreeSet;

class ComparableInterface {
    public static void main(String[] args) {
        TreeSet<Book> t1 = new TreeSet<>();
        Book b1 = new Book(1,"newBook", "sdfks", "dkfs", 345);
        Book b2 = new Book(2, "dhfs", "dfks", "dfgsf", 65);
        t1.add(b2);
        t1.add(b1);
        t1.add(b2);
//        System.out.println(t1);
        for(Book x : t1) {
            System.out.println(x);
        }
    }
}
class Book implements Comparable<Book> {
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        System.out.println("done");
    }
    public int compareTo(Book b) {
        if(this.id > b.id) {
            return 1;
        } else if(this.id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
    public String toString() {
        return "id: " + id + ", name: " + name + ", author: " + author
                + " publisher: " + publisher + ", quantity: " + quantity;
    }
}