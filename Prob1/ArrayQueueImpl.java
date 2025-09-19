package L9.Prob1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;
    // Add Constructors, Default and Parameterized to initialize instance fields
    public ArrayQueueImpl()
    {
        arr=new Integer[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }
    public ArrayQueueImpl(int capacity)
    {
        if (capacity > 0) {
            arr = new Integer[capacity];
        }
        else
        {
            arr = new Integer[DEFAULT_CAPACITY];
        }

        front = 0;
        rear = -1;
        size = 0;


    }

    public Integer peek() {
        //implement
        if (isEmpty()) return null;
        return arr[front];

    }
    public void enqueue(int v){
        //implement
        if (size==arr.length) resize();

        rear = (rear + 1) % arr.length;
        arr[rear] = v;
        size++;


    }
    public Integer dequeue() {
        if (isEmpty()) return null;
        var v=arr[front];
        arr[front]=null;
        front = (front + 1) % arr.length ;
        size--;
        if (size == 0)
        {
            front = 0;
            rear = -1;
        }
        return v;

    }
    public boolean isEmpty(){
        //implement
        return size==0;
    }
    public int size(){
        //implement
        return size;
    }
    private void resize(){
        //implement
        System.out.println("resizing");
        Integer[] tmpArr=new Integer[arr.length * 2];
        if (front <= rear) {
            // No wrap-around, copy a single block
            System.arraycopy(arr, front, tmpArr, 0, size);
        } else {
            // Wrap-around case, copy in two segments
            System.arraycopy(arr, front, tmpArr, 0, arr.length - front);
            System.arraycopy(arr, 0, tmpArr, arr.length - front, rear + 1);
        }
        front=0;
        arr=tmpArr;
        rear=size-1;
    }

    @Override
    public String toString(){
/* Return data in this format, each element separated by comma with in [ ]  eg:
[10, 20, 30, 40, 50, 60 ]*/
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; ++i) {
            //updated
            int idx = (front + i) % arr.length;
            sb.append(arr[idx].toString());
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayQueueImpl q=new ArrayQueueImpl(2);
        System.out.println("Front:" + q.front);
        System.out.println("Rear:" + q.rear);
        q.enqueue(10);
        System.out.println("Front:" + q.front);
        System.out.println("Rear:" + q.rear);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(31);


        System.out.println(q);
        System.out.println(q.peek());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("Peak after dequeue: " + q.peek());
        System.out.println(q);



        System.out.println(q);



    }
}
