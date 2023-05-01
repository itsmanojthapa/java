import javax.print.event.PrintEvent;

public class Main {
    public static void main(String[] args) {
   /*     CustomLinkList list =  new CustomLinkList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(3,100);
        list.display();
        
        System.out.println(list.deleteFirst());
        System.out.println(list.delete(2));
        list.display();                             */



        
    /*    DoublyLinkList list  = new DoublyLinkList();
        list .insertFirst(50);
        list .insertFirst(10);
        list .insertFirst(200);
        list .insertFirst(99);
        
        list.insertlast(5000);
        list.insert(99,85);
        list.displayrev();    */


        CircularLinkedList list = new CircularLinkedList();
        list.insert(23);
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.insert(45);
        list.delete(3);
        list.display();


    }
}
