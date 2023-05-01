import java.io.*;

public class ByteArrOStream {
    public static void main(String[] args) throws Exception {

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('x'); 
        bos.write('y');   
        bos.write('z');   
 
        // byte b[] = bos.toByteArray();
        // for(byte x:b) System.out.print((char)x);

        bos.writeTo(new FileOutputStream("C:/Learning_DSA_and_Basics_of_Programming/Topic wise/IOStreams/result.txt"));


        bos.close();

    }
}