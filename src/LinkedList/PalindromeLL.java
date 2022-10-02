package LinkedList;

import java.util.Scanner;

public class PalindromeLL {
        int data;
        PalindromeLL next;
        PalindromeLL(int data){
            this.data=data;
            this.next=null;
        }
        private static void print(PalindromeLL head) {
            if(head==null){
                return;
            }
            System.out.print(head.data+" ");
            print(head.next);
        }
        private static PalindromeLL takeInput() {
            Scanner sc= new Scanner(System.in);
            PalindromeLL head= null;
            PalindromeLL tail=null;
            System.out.println("Enter Node data");
            int data=sc.nextInt();
            while(data!=-1){
                PalindromeLL currentNode=new PalindromeLL(data);
                if(head==null){
                    head=currentNode;
                    tail=currentNode;
                }else{
                    tail.next=currentNode;
                    tail=tail.next;
                }
                data=sc.nextInt();
            }
            return head;
        }

        public static void main(String[] args) {
            PalindromeLL head=takeInput();
            System.out.println("LL is "+ findPalindromOrNot(head));

    }
    private static boolean findPalindromOrNot(PalindromeLL head) {
       // if head==null then true and there is only one element
        if(head==null||head.next==null){
            return true;
        }
        // first step to find mid mid node
        PalindromeLL mid =finMidNode(head);
        System.out.println(mid.data);
        //now we have mid node in mid then we need to reverse the linked list from mid.next but
        //we need to compare the last data with head data
        //and when reverse done then last node data should be equal to head data
        // and moves both one step forward till last node points to null
        PalindromeLL last=reverse(mid.next);
        //now last points to last node
        PalindromeLL curr=head;

        while(last!=null){
            if(last.data!=curr.data){
          return  false;
            }
            curr=curr.next;
            last=last.next;
        }
        //if we are here means all values are equals
        return true;
    }

    private static PalindromeLL finMidNode(PalindromeLL head) {
            PalindromeLL fast=head;
            PalindromeLL slow=head;
            //fast moves two steps and slow moves one step
        //if once fast points to null then slow at middle node;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            //for even cases if once fast ==null then we dont need to update slow
            if (fast!=null) slow=slow.next;
        }
        return slow;
    }

    private static PalindromeLL reverse(PalindromeLL middle) {
        PalindromeLL prev=null;
        PalindromeLL curr=middle;
        PalindromeLL agla=middle.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=agla;
            if(agla!=null)  agla=agla.next;
        }
        return prev;
    }
}
