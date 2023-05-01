import java.io.*;

public class FOStream {
    public static void main(String[] args) {

        try {
            FileOutputStream fs = new FileOutputStream(
                    "C:/Learning_DSA_and_Basics_of_Programming/Topic wise/IOStreams/OutputStream.txt");

            String str = "hello every one ";

            // fs.write(str.getBytes());

            // byte b[] = str.getBytes();
            // for (byte x : b) {
            // fs.write(x);
            // }

            byte b[] = str.getBytes();
            fs.write(b, 6, str.length() - 6);

            fs.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}