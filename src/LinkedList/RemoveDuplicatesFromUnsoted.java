package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsoted {
    public static void main(String[] args) {
        Node<Integer> head =Node.TakeInput();
        Node.print(head);
        removeDuplicatesfromUnsorted(head);
        Node.print(head);
    }

    private static Node<Integer> removeDuplicatesfromUnsorted(Node<Integer> head) {
        if(head==null) return null;
        HashSet<Integer> set=new HashSet<>();
        set.add(head.data);
        Node<Integer> prev=head;
        Node<Integer> temp =head.next;

        while(temp!=null){
            if(set.contains(temp.data)){
                prev.next=temp.next;


            }else{
                set.add(temp.data);
                prev=temp;
            }
            temp=temp.next;

        }




        return head;



    }
}
