package L9.Prob2;

public class StackWithLinkedList {

    class Node {
        Object data;
        Node next;
        Node(Object item){
            // constructor
            data = item;
            next=null;
        }
    }

    private Node top;
    private int size=0;
    public StackWithLinkedList()
    {
       top=null;
    }

    public void push(Integer x) {
        if (x == null) return;
        var newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;

    }
    public Integer peek() {
        //returns null if stack is empty
        if (isEmpty()) {
            return null;
        }
        return (Integer) top.data;
    }
    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        Integer tmp = (Integer) top.data;
        top = top.next;
        size--;
        return tmp;
    }
    public boolean isEmpty(){ // true if stack is empty
        return top == null;
    }

    public int size(){ // returns number of items in the stack
        return size;
    }
    @Override
    public String toString() {
        if(size==0) return "<empty>";
        StringBuilder sb = new StringBuilder();
        Node tmp=top;
        while (tmp !=null)
        {
                sb.append(tmp.data.toString()).append(" ");
                tmp=tmp.next;
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        StackWithLinkedList list=new StackWithLinkedList();
        list.push(10);
        list.push(20);
        System.out.println("Size: " + list.size());
        System.out.println(list.toString());
        System.out.println("peek" + list.peek());
        System.out.println("pop :" + list.pop());
        System.out.println("peek " + list.peek());
        System.out.println("pop " + list.pop());
        //System.out.println("pop " + list.pop());
        System.out.println("peek " + list.peek());
        System.out.println("Size: " + list.size());
        System.out.println(list.toString());


    }
}
