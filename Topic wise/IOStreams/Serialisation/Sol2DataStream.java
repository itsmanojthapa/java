
import java.io.*;

class studentt {
    int rollno;
    String name;
    String dep;
}

public class Sol2DataStream {
    public static void main(String[] args) throws Exception {

        do {
            FileOutputStream fos = new FileOutputStream("My.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            Student s1 = new Student();
            s1.rollno = 10;
            s1.name = "manoj";
            s1.dep = "BCA";

            dos.writeInt(s1.rollno);
            dos.writeUTF(s1.name);
            dos.writeUTF(s1.dep);

            dos.close();
            fos.close();
        } while (false);

        do {

            FileInputStream fis = new FileInputStream("My.txt");
            DataInputStream dis = new DataInputStream(fis);

            Student s = new Student();
            s.rollno = dis.readInt();
            s.name = dis.readUTF();
            s.dep = dis.readUTF();

            System.out.println(s.rollno);
            System.out.println(s.name);
            System.out.println(s.dep);

            dis.close();
            fis.close();

        } while (false);
    }
}
