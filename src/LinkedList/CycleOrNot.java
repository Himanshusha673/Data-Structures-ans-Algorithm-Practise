package LinkedList;

import java.util.HashMap;
import java.util.Scanner;

import static LinkedList.Node.TakeInput;

public class CycleOrNot {
    public static void main(String[] args) {
       Node<Integer> head= TakeInput();
        System.out.println(checkCycle(head));


    }
// method one but space complexity is not good
//    private static boolean checkCycle(Node<Integer> head) {
//        if(head.next==null||head==null) return false;
//        HashMap<Node,Integer> map = new HashMap<>();
//        Node temp= head;
//        while(temp!=null){
//            if(map.containsKey(temp)){
//                return true;
//            }else{
//                map.put(temp, (Integer) temp.data);
//            }
//            temp=temp.next;
//        }
//        return false;
//
//
//
//    }
private static boolean checkCycle(Node<Integer> head) {
        if(head==null||head.next==null) return false;
        Node<Integer> slow= head;
        Node<Integer> fast= head;

        while(fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) return true;
        }
        return false;


}


}
