package DSA.qStack;

public class Queee {

    int[] arr;
    int front;
    int rear;
    int max;
    int size;


    public Queee(int size) {
        arr = new int[size];
        max=size;
        front=0;
        rear=-1;
        size=0;
    }

    public void enq(int a) {
        if (isFull()) {
            System.out.println("Q overflow");
        } else {
            rear=(rear+1)%max;
            arr[rear] = a;
            size++;
            System.out.println("Inserted");
        }
    }

    public void deq() {
        if (isEmpty()) {
            System.out.println("Q empty");
        } else {
            front=(front+1)%max;
            size--;
            System.out.println("Removed");
        }
    }

    public void peek() {
        if (isEmpty()){

        } else {
            System.out.println(arr[front]);
        }
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return size==0?  true : false;
    }

    private boolean isFull() {
        return size==max ?  true : false;
    }


}
