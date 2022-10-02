package LinkedList;

import java.util.Scanner;

public class FindMiddleElement {

    int data;
    FindMiddleElement next;
    FindMiddleElement(int data){
        this.data=data;
        this.next=null;
    }
    private static void print(FindMiddleElement head) {
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static FindMiddleElement takeInput() {
        Scanner sc= new Scanner(System.in);
        FindMiddleElement head= null;
        FindMiddleElement tail=null;
        System.out.println("Enter Node data");
        int data=sc.nextInt();
        while(data!=-1){
            FindMiddleElement currentNode=new FindMiddleElement(data);
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
        FindMiddleElement head=takeInput();
        printMiddle(head);

    }

    private static void printMiddle(FindMiddleElement head) {
       int countNodes=0;
       FindMiddleElement temp=head;

       while(temp!=null){
           countNodes++;
           temp=temp.next;
       }
       temp=head;

       // System.out.println(countNodes);
       int mid=(countNodes/2)+1;
       for(int i=1;i<mid;i++){
           temp=temp.next;
       }
        System.out.println(temp.data);



    }


}
