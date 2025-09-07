package DSA.ll;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        testDll();
        testSll();
        testCsll();

        CircSll cs = new CircSll();

        cs.traverseFor();
        cs.insertAtBegin(1);
        cs.insertAtBegin(2);
        cs.insertAtBegin(3);
        cs.insertAtBegin(4);
        cs.traverseFor();
        cs.delete(4);
        cs.traverseFor();
    }

    private static void testCsll() {
        CircSll cs = new CircSll();
        cs.traverseFor();
        cs.insertAtEnd(1);
        cs.traverseFor();
        cs.insertAtEnd(2);
        cs.insertAtEnd(3);
        cs.insertAtEnd(4);
        cs.traverseFor();
    }

    private static void testSll() {
        SingleLl ll = new SingleLl();
        ll.display();
        ll.delete(); //delete first
        ll.insert(1);
        ll.insert(2);
        ll.display(); //peek last
    }

    private static void testDll() {
        DoublyLl dl = new DoublyLl();
        dl.traverseFor();
        dl.traverseBack();

        dl.insertAtEnd(1);
        dl.insertAtBegin(2);

        dl.insertAtEnd(3);
        dl.insertAtBegin(4);

        dl.traverseFor();
        dl.traverseBack();

        dl.delete(4);
        dl.traverseFor();
        dl.delete(1);
        dl.traverseFor();
        dl.delete(3);
        dl.traverseFor();
    }
}
