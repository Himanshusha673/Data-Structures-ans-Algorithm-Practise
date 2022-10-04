package LinkedList;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        Node<Integer> head =Node.TakeInput();
        Node.print(head);
        removeDuplicates(head);
        Node.print(head);
    }

    private static Node<Integer> removeDuplicates(Node<Integer> head) {
        if(head==null) return null;
        Node<Integer> temp= head.next;
        Node<Integer> prev =head;


        while(temp!=null){
            if(temp.data==prev.data){
                prev.next=temp.next;

            }else{
                prev=temp;
            }
            temp=temp.next;


        }
        return head;

        

    }
}
