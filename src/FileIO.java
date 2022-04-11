import java.io.*;
import java.time.LocalDate;

class Employee implements Serializable {
    String name;
    int age;
    int id;
    int salary;
    LocalDate date_of_join;
    Employee(String name, int age, int id, int salary, LocalDate doj) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
        this.date_of_join = doj;
    }
    public String toString() {
        String msg = "Name: " + name + "\nAge: " + age + "\nSalary: " + salary +
                "\nID: " + id + "\nDate of join: " + date_of_join;
        return msg;
    }
}
class FileIO {
    public static void main(String[] args) {
        // Serialization: writing an object onto the file.
        Employee emp = new Employee("Ankit", 20,15, 89000, LocalDate.of(2022, 04, 11));
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {
            fout = new FileOutputStream("D:object.txt");        // fout is path
            oos = new ObjectOutputStream(fout);   // oos is road
            // FileOutputStream is a byte stream class, fout is obj of that, so it can be passed
            // to ObjectOutputStream. as ObjectOutputStream requires byte stream class as a parameter.
            // path = ByteStream
            // road = ObjectOutputStream
            oos.writeObject(emp);

        } catch(FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Error writing the file...");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Error writing object ...");
        } finally {
            if(oos != null) {
                try {
                    oos.close();
                } catch(IOException e) {
                    System.out.println("Error!, can't close the file...");
                }
            }
            if(fout != null) {
                try {
                    fout.close();
                } catch(IOException e) {
                    System.out.println("Error!, can't close the file...");
                }
            }
        }
        // calling a function to perform de-serialization
         deSerial();
    }
    static void deSerial() {
        // reading an object from the file
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try {
            fin = new FileInputStream("D:object.txt");
            ois = new ObjectInputStream(fin);

            Employee e = (Employee)ois.readObject();
            System.out.println("State of returned object is: \n" + e);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found...");
        } catch (IOException e) {
            System.out.println("IOException occurred...");
        } catch (ClassNotFoundException e) {
            System.out.println("Error Employee class not found...");
        } finally {
            if(fin != null) {
                try {
                    fin.close();
                } catch(IOException e) {
                    System.out.println("IOException occurred while closing file input stream object.");
                }
            }
            if(ois != null) {
                try {
                    ois.close();
                } catch(IOException e) {
                    System.out.println("IOException occurred while closing object input stream object.");
                }
            }
        }
    }
}
