import java.io.*;

public class StoringFloat {
    public static void main(String[] args) throws Exception {

        do {
            Float f[] = { 1.4f, 0.1f, 5.0f, 99f, .99f, 0.25f, 0.16f, 0.78f, 99.1f };
            FileOutputStream fos = new FileOutputStream("My.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(f.length);
            for (Float x : f) {
                dos.writeFloat(x);
            }

            fos.close();
            dos.close();

        } while (false);

        do {
            FileInputStream fis = new FileInputStream("My.txt");
            DataInputStream dis = new DataInputStream(fis);
            int x;
            System.out.println(x = dis.readInt());
            for (int i = 0; i < x; i++) {
                System.out.print(dis.readFloat() + " ");
            }

            fis.close();
            dis.close();

        } while (false);

    }
}