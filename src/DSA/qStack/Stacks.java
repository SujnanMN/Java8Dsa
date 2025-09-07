package DSA.qStack;

public class Stacks {
    private int top;
    private int max;
    private int[] arr;

    public Stacks(int max) {
        top=-1;
        arr = new int[max];
        this.max = max;
    }

    public void push(int element) {
        if (top==max-1) {
            System.out.println("Stack overflow");
        } else {

            arr[++top]=element;
            System.out.println("Element pushed");
        }


    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return arr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println(arr[0]);
        return arr[top];

    }

    private boolean isEmpty() {
        return top==-1 ? true : false;
    }

}