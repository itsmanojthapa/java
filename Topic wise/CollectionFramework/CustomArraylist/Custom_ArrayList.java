import java.util.Arrays;

public class Custom_ArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size  = 0;
    
    public Custom_ArrayList(){
        this.data =new int[DEFAULT_SIZE];
    }
    
    public  void add(int num){
        if(this.isFull() ){
            resize();
        }
        data[size++] = num;
    }
    private void resize(){
        int[] temp = new int[data.length*2];

        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    
    private boolean isFull(){
        return size==data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public  int get(int index){
        return data[index];
    }

    public  int size(){
        return size;
    }

    public  void set (int index ,int value){
        data[index] =value;
    }


    @Override
    public String toString() {
        return "Custom_ArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
	// write your code here
        Custom_ArrayList list = new Custom_ArrayList();
        for (int i = 0; i <15 ; i++) {
            list.add(i*2+1);
        }

        System.out.println(list);
    }
}
