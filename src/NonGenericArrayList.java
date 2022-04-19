import java.util.ArrayList;

public class NonGenericArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        // internally: ArrayList<Object> al = new ArrayList<Object>();
        // this is a Non-Generic ArrayList (Non-generic Collection), it can contain elements of any time
        // but with this come a lot of limitations, and issues.

        al.add("Sachin");
        al.add("Rahul");
        al.add(10);

//        String s1 = al.get(0); will give error because al.get(0) will return Object class reference variable
//        so need to downcast it into String class, to hold it in String s1
//        because child cannot hold a parent object / reference variable
        String s1 = (String)al.get(0);  // this is correct
        // So, demerit is, that you have to downcast before fetching any element,
        // and that too, downcast by giving the correct class name by remembering which type element will be at particular index
        // if you make any mistake in this, program will crash !

        String s2 = (String)al.get(1);

        try {
//            Causes Runtime Exception : because at [2] we stored an integer, so can't cast Integer to String
            String s3 = (String)al.get(2);
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }

        // So use Generic ArrayList (i.e. with type), because generics enables compiler to give error during compile time
        // when you insert any other irrelevant data type value.
        // Also you won't require to downcast any value then.
        /*
        * ArrayList<String> ar = New ArrayList<>();
        * ar.add("Hi");     // correct
        * ar.add(43);       // compile time error!!
        *
        * String s = ar.get(0); // works perfectly
        * */
    }
}
