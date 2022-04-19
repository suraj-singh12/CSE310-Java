class GenericsInJava2 {
    public static void main(String[] args) {
        Gen2<String, Integer> obj = new Gen2<String, Integer>("Hello", 35);
        System.out.println(obj.getObject1());
        System.out.println(obj.getObject2());
        obj.showObjects();

        System.out.println();

        Gen2<Integer, Double> obj1 = new Gen2<Integer, Double>(324,3452.34);
        System.out.println(obj1.getObject1());
        System.out.println(obj1.getObject2());
        obj1.showObjects();
    }
}
// custom generic class with multiple parameters
class Gen2<T1, T2> {
    T1 object1;
    T2 object2;
    Gen2(T1 obj1, T2 obj2) {
        object1 = obj1;
        object2 = obj2;
    }

    T1 getObject1() {
        return object1;
    }
    T2 getObject2() {
        return object2;
    }
    void showObjects() {
        // getClass() method returns the `datatype` of the object
        System.out.println("Class of object1: " + object1.getClass());
        System.out.println("Class of object2: " + object2.getClass());
    }
}
