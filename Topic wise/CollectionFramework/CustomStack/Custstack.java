

public class Custstack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pointer = -1;



    

    public Custstack(){
        this(DEFAULT_SIZE);   /*it will call custstack(int size )*/
    }

    public Custstack(int size ){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Can not pop from an empty stack!!");
        }
        // int removed = data[pointer];
        // pointer--;
        // return removed;
        return data[pointer--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peal from an empty staxk!!");
        }
        return data[pointer];
    }
 
    private boolean isFull(){
        return pointer == data.length-1;
    }
    
    private boolean isEmpty(){
        return pointer == -1;
    }
}
