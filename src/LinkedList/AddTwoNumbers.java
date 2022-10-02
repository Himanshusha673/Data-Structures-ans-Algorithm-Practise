//You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order,
//   and each of their nodes contains a single digit. Add the two numbers and
// return the sum as a linked list.
//Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
//Example 2:
//
//        Input: l1 = [0], l2 = [0]
//        Output: [0]
//        Example 3:
//
//        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        Output: [8,9,9,9,0,0,0,1]
//
//
//        Constraints:
//
//        The number of nodes in each linked list is in the range [1, 100].
//        0 <= Node.val <= 9
//        It is guaranteed that the list represents a number that does not have leading zeros.

import java.util.Scanner;

public class AddTwoNumbers {
    int data;
    AddTwoNumbers next;
    AddTwoNumbers(int data){
        this.data=data;
        this.next=null;
    }

    public static void main(String[] args) {
        AddTwoNumbers head1=takeInput();
       // print(head1);

        AddTwoNumbers head2= takeInput();
        //print(head2);

        AddTwoNumbers finalHead=addTwoLL(head1,head2);
        print(finalHead);


    }

    private static AddTwoNumbers addTwoLL(AddTwoNumbers head1, AddTwoNumbers head2) {
        // if question says reversed already given then we no need to reverse these lists
        //but in this question only list given so we need to traveerse it because traversing
        // from last node in linkedlist is not possible it will take a lot time
        AddTwoNumbers newh1=reverse(head1);
        AddTwoNumbers newh2=reverse(head2);
        int carry=0;
        int sum;
        AddTwoNumbers temp;
        AddTwoNumbers finalhead=null;
        AddTwoNumbers prev=null;
        while(newh1!=null||newh2!=null){
            //finding data of both lists, if one becomes null
            // then we need to make that list data to 0 so that we can make addition
            //after addition we are creating a new LinkedList of head final head and ans would be reverse of that
            int pehlaData=newh1!=null?newh1.data:0;
            int dusraData=newh2!=null?newh2.data:0;
            sum=(carry+pehlaData+dusraData)%10;
            carry=(carry+pehlaData+dusraData)/10;
            //creating a new linkedlist final
            temp=new AddTwoNumbers(sum);
            if(finalhead==null){
                finalhead=temp;
               prev=temp;
            }else{
               prev.next=temp;
                prev=prev.next;
            }
            if(newh1!=null)newh1=newh1.next;
            if(newh2!=null) newh2=newh2.next;
        }
        if(carry!=0){
            //means there is an extra node
            temp=new AddTwoNumbers(1);
             prev.next=temp;
        }

       if(finalhead!=null) finalhead=reverse(finalhead);

        return finalhead;
    }

    private static AddTwoNumbers reverse(AddTwoNumbers head) {
        AddTwoNumbers prev=null;
        AddTwoNumbers curr=head;
      AddTwoNumbers agla=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=agla;
            if(agla!=null)  agla=agla.next;

        }
        return prev;
    }

    private static void print(AddTwoNumbers head) {
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
         print(head.next);


    }


    private static AddTwoNumbers takeInput() {
        Scanner sc= new Scanner(System.in);
        AddTwoNumbers head= null;
        AddTwoNumbers tail=null;
        System.out.println("Enter Node data");
        int data=sc.nextInt();
        while(data!=-1){
            AddTwoNumbers currentNode=new AddTwoNumbers(data);
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


}
