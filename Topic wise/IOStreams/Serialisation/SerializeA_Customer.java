import java.io.*;
import java.util.Scanner;

class Customerr implements Serializable {
    String id;
    String name;
    String phone;
    static int count = 0;

    Customerr() {

    }

    Customerr(String n, String p) {
        id = "C" + count;
        count++;
        name = n;
        phone = p;

    }

    public String toString() {
        return "Customer ID : " + id + "\nName : " + name + "\nPhone Number : " + phone;
    }

}

public class SerializeA_Customer {
    public static void main(String[] args) throws Exception {

        do {
            Customer list[] = { new Customer("ab", "4654654"), new Customer("gfsg", "65465465"),
                    new Customer("adfgafg", "5435434"),
                    new Customer("wetw", "3646"), new Customer("mlkjl", "5454"), new Customer("xcvxcv", "654654"),
                    new Customer("pioipo", " 09887") };

            FileOutputStream fos = new FileOutputStream("Data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(list.length);
            for (Customer x : list) {
                oos.writeObject(x);
            }

            oos.close();
            fos.close();

        } while (false);

        do {

            FileInputStream fis = new FileInputStream("Data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int length = ois.readInt();

            Customer list[] = new Customer[length];
            for (int i = 0; i < length; i++) {
                list[i] = (Customer) ois.readObject();
                System.out.println(list[i] + "\n");
            }

            System.out.println("Find Customer by Name Enter Name");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();

            for (int i = 0; i < length; i++) {

                if (name.equalsIgnoreCase(list[i].name))
                    System.out.println(list[i] + "\n");
            }

            fis.close();
            ois.close();

        } while (false);

    }
}