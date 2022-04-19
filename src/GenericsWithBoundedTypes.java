public class GenericsWithBoundedTypes {
    // Generics With Bounded Types
    /*
    Question:
    Create a generic class that contains a method that returns the average of an array of numbers
    of any type, including integers, floats, and doubles.

    Problem in this: What if someone passes String as a type to this class,
    and then calls the average() fn. The program will crash.
    So that's why we want a generic class with bounded types.
     */
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        Gen3<Integer> obj = new Gen3<Integer>(nums);
        System.out.println(obj.average());
    }
}

class Gen3<T extends Number> {  // add extends Number (class), so it will accept only Number types
    T[] nums;
    Gen3(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for(int i = 0; i < nums.length; ++i) {
            sum += nums[i].doubleValue();  // Error!, method undefined for type T
        }
        return sum / nums.length;
    }
}