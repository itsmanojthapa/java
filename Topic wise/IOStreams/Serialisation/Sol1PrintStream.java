
import java.io.*;

class Student3 {
    int rollno;
    String name;
    String dep;
}

public class Sol1PrintStream {
    public static void main(String[] args) throws Exception {

        do {
            FileOutputStream fos = new FileOutputStream("My.txt");
            PrintStream ps = new PrintStream(fos);

            Student s1 = new Student();
            s1.rollno = 10;
            s1.name = "manoj";
            s1.dep = "BCA";

            ps.println(s1.rollno);
            ps.println(s1.name);
            ps.println(s1.dep);

            ps.close();
            fos.close();
        } while (false);

        do {

            FileInputStream fis = new FileInputStream("My.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            Student s = new Student();
            s.rollno = Integer.parseInt(br.readLine());
            s.name = br.readLine();
            s.dep = br.readLine();

            System.out.println(s.rollno);
            System.out.println(s.name);
            System.out.println(s.dep);

            dis.close();
            fis.close();

        } while (false);
    }
}
