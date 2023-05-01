
import java.io.*;

//obj must implement seralizable
// must have non-seralized constructer
//static transient member donot gets seralized and donot gets stored
class Student implements Serializable {
    int rollno;
    String name;
    String dep;
    static int data = 10;
    transient int t;

    Student() {
    }

    Student(int a, String b, String c, int e) {
        rollno = a;
        name = b;
        dep = c;
        data = 200;
        t = e;
    }

    @Override
    public String toString() {
        return "\nSTUDENT DETAILS" +
                "\nRollNo : " + rollno +
                "\nName : " + name +
                "\nDepartment : " + dep +
                "\nData : " + data +
                "\nTransient : " + t;

    }
}

public class Sol3Serialisation {
    public static void main(String[] args) throws Exception {

        do {

            FileOutputStream fos = new FileOutputStream("My.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Student s = new Student(10, "Manoj", "BCA", 5);
            oos.writeObject(s);

            fos.close();
            oos.close();

        } while (false);

        do {

            FileInputStream fis = new FileInputStream("My.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student p = new Student();
            p = (Student) ois.readObject();

            System.out.println(p);

            fis.close();
            ois.close();

        } while (false);
    }
}