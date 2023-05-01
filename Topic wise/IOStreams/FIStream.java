import java.io.*;

public class FIStream {
    public static void main(String[] args) throws Exception {

        try (FileInputStream fi = new FileInputStream(
                "C:/Learning_DSA_and_Basics_of_Programming/Topic wise/IOStreams/OutputStream.txt")) {
            // byte b[] = new byte[fi.available()];
            // fi.read(b);
            // String str = new String(b) ;
            // System.out.println(str);

            int x;
            do {
                x = fi.read();
                if (x != -1)
                    System.out.print((char) x);
            } while (x != -1);

        }

    }
}