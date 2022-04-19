public class GenericsInJava {
    /*
    Generics in Java is like templates in C++
    create the class only once as generic class, and whatever type user passes
    and java will create a class of that type using the generic class.
    So for different data types you don't need to write multiple classes,
    instead write one generic class.
     */
    public static void main(String[] args) {
        Gen<Integer> obj = new Gen<Integer>();
        Gen<Double> obj2 = new Gen<Double>();
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
