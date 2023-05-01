@SuppressWarnings("unchecked")
class MyArray<E> {
    E[] arr = (E[]) new Object[10];
    int length = 0;

    public void append(E x) {
        arr[length] = x;
        length++;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class A {

}

class B extends A {

}

class C extends A {

}

public class GenericMethods {
    public static void main(String[] args) {

        show(new String[] { "hi", "hello", "how", "are", "you" });
        show(new Integer[] { 10, 51, 0, 654, 2, 654, 654, });

        // MyArray<String> strarr = new MyArray<>();
        // strarr.append("nv");
        // strarr.append("ghdfg");
        // strarr.append("eer");
        // fun(strarr);

        MyArray<Integer> intarr = new MyArray<>();
        intarr.append(1);
        intarr.append(984);
        intarr.append(3210);
        fun(intarr);

        MyArray<B> are = new MyArray<>();
        fun1(are);

    }

    // ? -->wild card any obj
    // we can use extends or super
    static void fun(MyArray<? extends Number> obj) {
        obj.display();
    }

    // When you are declaring a variable that time inside wild card parameter or
    // variable type you can use super
    static void fun1(MyArray<? super B> obj) {
        obj.display();
    }

    static <E> void show(E[] arr) {
        for (E x : arr) {
            System.out.print(x + " ");
        }
    }
}
