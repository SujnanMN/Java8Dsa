package DSA.qStack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        testStack();
        testQueue();
    }

    private static void testQueue() {
        Queee q = new Queee(5);
        System.out.println(q.size());
        q.deq();
        q.enq(1);
        q.enq(1);
        q.enq(1);
        q.enq(1);
        q.enq(1);
        q.enq(1);
    }

    private static void testStack() {
        Stacks st = new Stacks(5);
        st.pop();
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.peek();

        Stack st2 = new Stack();
        st2.push(1);
    }
}
