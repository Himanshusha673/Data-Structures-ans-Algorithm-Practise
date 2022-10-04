package LinkedList;

import java.util.Scanner;

public class RemovGivenData {
    public static void main(String[] args) {
        Node<Integer> head =Node.TakeInput();
        Scanner sc=new Scanner(System.in);
        Node.print(head);
        int val =sc.nextInt();
        removeData(head,val);
        Node.print(head);
    }

    private static Node<Integer> removeData(Node<Integer> head,int val) {
        if(head==null) return null;
        Node<Integer> temp= head;
        Node<Integer> prev =null;

        while(temp!=null&&head!=null){
            if(head.data==val){
                head= head.next;
                temp=head;
                continue;
            }
            if(temp.data==val){
             prev.next=temp.next;
            }else{
                prev=temp;
            }
            temp=temp.next;


        }
        return head;
    }
}
