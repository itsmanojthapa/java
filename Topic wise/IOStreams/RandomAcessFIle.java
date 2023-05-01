import java.io.*;

// Random acessFile implements Data Input Output

public class RandomAcessFIle {
    public static void main(String[] args) throws Exception {

        RandomAccessFile rf = new RandomAccessFile(
                "C:/Learning_DSA_and_Basics_of_Programming/Topic wise/IOStreams/result.txt", "rw");
        // rw is read write mode

        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());

        // after writing also pointer will move
        rf.write('E');
        System.out.println((char) rf.read());
        rf.skipBytes(2);
        System.out.println((char) rf.read());
        // it take to position pos
        rf.seek(3);
        System.out.println((char) rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer() + 2);
        System.out.println(rf.getFilePointer());

    }
}