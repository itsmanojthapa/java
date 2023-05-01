@SuppressWarnings("unchecked")

class MyArray2<E> {
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

class MyArraySubType extends MyArray<String> {

}

class MyArraySubType2<T> extends MyArray<T> {

}

class MyArray0<T, E> {

}

public class GenericClass {
    public static void main(String[] args) {
        {
        }
        // if i donot pass any thing it will store as a Object
        MyArray<Integer> arr = new MyArray<>();
        arr.append(10);
        arr.append(1);
        arr.append(0);
        arr.append(456);
        arr.append(44);
        arr.append(78);

        arr.display();
        MyArray0<String, Integer> arMyArray0 = new MyArray0<>();
        AA<C> a = new AA<>();

    }
}
// BOUNDS

// T can be only be object of class entends Number
// Number-->Byte,Integer,Long,FLoat, Doubble ,Short

class MyArrayBoundedType<T extends Number> {

}
/**
interface Aa {

}

class Bb implements A {

}

class Cb implements A {

}

// A--> B,C
class AA <T extends A> {

}
*/