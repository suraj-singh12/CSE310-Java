public class GenericsInJava {
    /*
    Generics in Java is like templates in C++
    create the class only once as generic class, and whatever type user passes
    and java will create a class of that type using the generic class.
    So for different data types you don't need to write multiple classes,
    instead write one generic class.
     */
    public static void main(String[] args) {
        Gen<Integer> obj1 = new Gen<Integer>();

        obj1.set(23);
        Integer i = obj1.get();
        System.out.println(i.intValue());

        Gen<Double> obj2 = new Gen<Double>();
        obj2.set(23.6);
        Double d = obj2.get();
        System.out.println(d.doubleValue());
    }
}
// creating our own custom Generic class
// Note: Gen is not the keyword, it is my class name.
class Gen<T> {
    T value;
    void set(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }
}
