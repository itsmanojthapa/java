import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws Exception {

        FileReader  fr = new FileReader("c:/Learning_DSA_and_Basics_of_Programming/Topic wise/IOStreams/result.txt");
        BufferedReader   br = new BufferedReader(fr);


        System.out.print((char) br.read());
        System.out.print((char) br.read());
        System.out.print( (char)  br.read());
        br.mark(11);
        System.out.print( (char)  br.read());
        System.out.print( (char)  br.read());
        br.reset();
        System.out.print( (char)  br.read());
        System.out.print( (char)  br.read());
        System.out.println( (char)  br.read());
        System.out.print(br.readLine());

        br.close();
        fr.close();
    }
}