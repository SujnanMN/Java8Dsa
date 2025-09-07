package DSA.ll;

public class SingleLl {

    Node head;

    //insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    //delete first
    public void delete() {
        if (head==null) {
            System.out.println("Nothing to delete");
        }
        head=head.next;
    }

    //display at the end
    public void display() {
        if (head ==null)
            System.out.println("Nothing to display");

        Node temp = head;

        while(temp.next!=null) {
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head ==null) {
            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }

    public void insertAtPos(int data, int position) {

    }

    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}


