package DSA.ll;

public class CircSll {

    private Node head;
    private Node tail;

    public void insertAtEnd(int data) {
        Node newNode =  new Node(data);
        if (head==null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head = tail = newNode;
            head.next=head;
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        head=newNode;
    }

    public void traverseFor() {

        if (head==null) {
            System.out.println("null");
            return;
        }
        Node temp = head;

        while(temp!=tail) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data+"--->"+temp.next.data);

    }

    public void delete(int data) {
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=tail) {
            if (temp.data==data){
                if (temp==head) {
                    tail.next=temp.next;
                    head=temp.next;
                } else if (temp==tail) {
                    tail.prev=head;
                    tail=tail.prev;
                } else {
                    temp.prev=temp.next;
                }
                break;
            }
            temp=temp.next;
        }
    }

    private class Node{
        private Node next;
        private int data;

        private Node(int data) {
            this.data = data;
            next=null;
        }
    }
}