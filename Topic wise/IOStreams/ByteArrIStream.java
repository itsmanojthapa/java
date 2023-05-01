import java.io.*;

public class ByteArrIStream {
    public static void main(String[] args) throws Exception {

        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        // int x;
        // while((x=bis.read())!=-1){
        // System.out.print( (char)x);
        // }

        // String str = new String(bis.readAllBytes());
        // System.out.print(str);

        // System.out.print(bis.markSupported());

        bis.close();

    }
}