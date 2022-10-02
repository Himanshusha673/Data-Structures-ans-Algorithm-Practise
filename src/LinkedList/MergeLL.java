package LinkedList;

import java.util.Scanner;

public class MergeLL <T>{
     T data;
    MergeLL<T> next;

    MergeLL (T data){

        this.data=data;
        next=null;
    }
    public static void print(MergeLL<Integer> head) {
        MergeLL<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
    public static MergeLL<Integer> Merge(MergeLL<Integer> head1,MergeLL<Integer> head2){
        MergeLL<Integer> head=null;
        MergeLL<Integer> Tail= null;
        if(head1.data<=head2.data){
            head=head1;
            Tail=head1;
        } if(head2.data<head1.data){
            head=head2;
            Tail=head2;
        }
        while(head1!=null||head2!=null){
            if(head1.data<head2.data){
                head1.next=head2;
                Tail=head2;
                head1=head1.next;

            }else if(head2.data<head1.data){
                head2.next=head1;
                Tail=head1;
                head2=head2.next;

            }else{
                head1.next=head2;
                head1=head1.next;
                head2=head2.next;
            }
        }
        if(head1.next==null){
            head1.next=head2;
        }else{
            head2.next=head1;
        }
        return head;
    }
    public static MergeLL<Integer> TakeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        MergeLL<Integer> head=null;
        MergeLL<Integer> tail=null;
        while(data!=-1){
            MergeLL<Integer> currentNode=new MergeLL<>(data);
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
        MergeLL <Integer>t1=TakeInput();
        MergeLL <Integer>t2=TakeInput();
        MergeLL<Integer> head=Merge(t1,t2);
        print(head);
    }
}
