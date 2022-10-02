package LinkedList;

import java.util.Scanner;

public class MergeTwoSortedLIst<T> {
    T data;
    MergeTwoSortedLIst<Integer> next;

    MergeTwoSortedLIst(T data){
        this.data=data;
        next=null;
    }
    public static MergeTwoSortedLIst<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        MergeTwoSortedLIst<Integer> head=null;
        MergeTwoSortedLIst<Integer> tail=null;
        while(data!=-1){
            MergeTwoSortedLIst<Integer> currentNode=new MergeTwoSortedLIst<>(data);
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
    public static MergeTwoSortedLIst<Integer> mergeTwoSortedList(MergeTwoSortedLIst<Integer> head1,MergeTwoSortedLIst<Integer> head2){
        if(head1==null||head2==null) return head1!=null?head1:head2;
        MergeTwoSortedLIst<Integer> dummy=new MergeTwoSortedLIst<>(-2);
        MergeTwoSortedLIst<Integer> prev;
        //prev is pointing previous elemnt of minimum data in from c1 or c2
        MergeTwoSortedLIst<Integer> c1=head1;
        MergeTwoSortedLIst<Integer> c2=head2;
        prev=dummy;
        while(c1!=null&&c2!=null){
            if(c1.data<c2.data){
                //case when c1data less than c2 data nd mark prev acording
                prev.next=c1;
                c1=c1.next;
            }else {
                prev.next=c2;
                c2=c2.next;
            }
            prev=prev.next;
        }
        // if one of them are null then just add the previous to not null list
        prev.next= c1!=null?c1:c2;

        return dummy.next;
        //because dummy next pointing to our first element which is smaller from head1 and head2



    }
    public static void print(MergeTwoSortedLIst<Integer> head) {
        MergeTwoSortedLIst<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }



    public static void main(String[] args) {

       MergeTwoSortedLIst<Integer>t1=takeInput();
        MergeTwoSortedLIst <Integer>t2=takeInput();
        MergeTwoSortedLIst<Integer> head=mergeTwoSortedList(t1,t2);
        print(head);


    }
}
