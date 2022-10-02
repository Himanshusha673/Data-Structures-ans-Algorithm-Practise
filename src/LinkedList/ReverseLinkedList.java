package LinkedList;

import java.util.Scanner;

 public class ReverseLinkedList<T> {

          T data;
          ReverseLinkedList<Integer> next;
          ReverseLinkedList( T data) {
              this.data = data;
              next = null;
          }

          public static void print(ReverseLinkedList<Integer> head) {
             ReverseLinkedList<Integer> temp = head;
              while (temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
              }
          }

          public static ReverseLinkedList<Integer> TakeInput() {
              Scanner s = new Scanner(System.in);
              ReverseLinkedList<Integer> head = null;
              ReverseLinkedList<Integer> tail = null;

              System.out.println("Enter the values which you want to inset in linked list");
              int data = s.nextInt();
              while (data != -1) {
                  ReverseLinkedList<Integer> currentNode = new ReverseLinkedList<>(data);

                  if (head == null) {
                      head = currentNode;
                      tail = currentNode;
                  } else {
                      tail.next = currentNode;
                      tail = tail.next;
                      // or we can also do like this--> tail=currentNode;
                  }
                  data = s.nextInt();
              }
              return head;
          }

          public static ReverseLinkedList<Integer> reverse(ReverseLinkedList<Integer>head) {
              ReverseLinkedList<Integer> prev=null;
              ReverseLinkedList<Integer> curr=head;
              ReverseLinkedList<Integer> agla=head.next;
              while(curr!=null){
                  curr.next=prev;
                  prev=curr;
                  curr=agla;
                  if(agla!=null)  agla=agla.next;

              }
              return prev;
          }





     public static void main(String[] args) {
          ReverseLinkedList<Integer> head= TakeInput();
          print(head);
          ReverseLinkedList<Integer> newhead=reverse(head);
         System.out.println();
          print(newhead);
     }
 }
