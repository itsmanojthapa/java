

public class Main1 {
    public static void main(String[] args) {
        Custstack stack = new Custstack();
        System.out.println(stack.push(5));
        System.out.println(stack.push(4));
        System.out.println(stack.push(3));
        System.out.println(stack.push(2));
        System.out.println(stack.push(1));
        try {
            System.out.println(stack.pop() );
        } catch (StackException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
