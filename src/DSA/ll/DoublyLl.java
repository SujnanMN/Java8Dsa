package DSA.ll;

public class DoublyLl {

    Node head;
    Node tail;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head ==null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head = tail = newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void delete(int data) {
        Node temp = head;
        while(temp!=null) {
            if (temp.data==data) {
                if (temp==head) {
                    head=head.next;
                    head.prev=null;
                } else if (temp==tail) {
                    tail=tail.prev;
                    tail.next=null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev  = temp.prev;
                }
                return;
            }
            temp=temp.next;
        }
    }

    public void traverseFor() {
        if (head==null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void traverseBack() {
        System.out.print("null");

        if (head==null) {
            return;
        }

        System.out.println("<->");
        Node temp= tail;
        while(temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    class Node {
        private Node next;
        private Node prev;
        private int data;

        private Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }
}

