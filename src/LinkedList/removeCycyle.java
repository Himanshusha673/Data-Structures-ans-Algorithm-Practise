package LinkedList;

import static LinkedList.Node.TakeInput;

public class removeCycyle {
    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        //first find cyc
       removeCycle(head);


    }

    private static void removeCycle(Node<Integer> head) {
        if (head == null || head.next == null) return;
        Node<Integer> startingPosLoop = posCycle(head);
        Node<Integer> temp = startingPosLoop;

        while (temp.next != startingPosLoop) {
            temp = temp.next;
        }
        temp.next = null;


    }

    private static Node<Integer> posCycle(Node<Integer> head) {
        if (head == null || head.next == null) return null;
        //first find meet point
        Node<Integer> meet = meetPoint(head);
        Node<Integer> temp = head;
        // then find the point were temmp and meet equals so that point is (Dist from)meet=cycle* Dist(fromhead)
        while (meet != null) {
            if (meet == temp) return meet;
            meet = meet.next;
            temp = temp.next;
        }
        return null;
    }

    private static Node<Integer> meetPoint(Node<Integer> head) {
        if (head == null || head.next == null) return null;
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return slow;
        }
        return null;


    }
}
