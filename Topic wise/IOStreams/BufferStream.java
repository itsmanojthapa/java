import java.io.*;

public class BufferStream {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("c:/Learning_DSA_and_Basics_of_Programming/Topic wise/IOStreams/result.txt");
        BufferedInputStream  bis = new BufferedInputStream(fis);

        // int x;
        // while((x = bis.read() )!=-1){
        //     System.out.println((char)x);
        // }

        // System.out.println(bis.markSupported() );

        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println( (char)  bis.read());
        bis.mark(11);
        System.out.println( (char)  bis.read());
        System.out.println( (char)  bis.read());
        bis.reset();
        System.out.println( (char)  bis.read());
        System.out.println( (char)  bis.read());
        System.out.println( (char)  bis.read());

        bis.close();
        fis.close();
    }
}