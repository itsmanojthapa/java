
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(12);
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(10, 12, 51, 1, 65));

        arr.add(5);
        arr.add(1, 45);

        
        arr.addAll(arr2);
        System.out.println(arr.contains(45));
        System.out.println(arr.get(5));
        System.out.println(arr.indexOf(1));
        arr.add(6, 1);
        System.out.println(arr.lastIndexOf(1));

        // for (Iterator<Integer> it = arr.iterator(); it.hasNext();) {
        // java.lang.Integer x = it.next();
        // System.out.print(x + " ");
        // }

        // System.out.println(" ");
        // arr.forEach((x) -> {
        // System.out.print(x + " ");
        // });

        // System.out.println(" ");

        // Iterator<Integer> it = arr.iterator();
        // while (it.hasNext()) {
        // System.out.print(it.next() + " ");
        // }

        ListIterator<Integer> it = arr.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}