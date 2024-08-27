package com.dsa.linkedlist;

public class DeleteNode {

    static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(7);

        System.out.println("Before Deletion");
        printList(head);
        System.out.println("After Deletion");
        Node newHead1= delete(5,head);
        printList(newHead1);


    }

    private static Node delete(int data, Node head) {

        Node current=head;
        Node prev=null;

        if(head.data==data){
            head=head.next;
            return head;
        }

        while(current!=null){

            if(current.data==data){
                prev.next=current.next;
            }
            prev=current;
            current=current.next;

        }
        return head;
    }

    private static void printList(Node head)
    {
        Node curr = head;
        System.out.print("head->");
        while (curr != null) {
            System.out.print(" " + curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
