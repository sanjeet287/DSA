package com.dsa.linkedlist;

public class InsertNode {

    static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        int data=8;
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

//        Node newHead3 = insert (data);
//        printList(newHead3);
//        Node newHead=insertAtFront(data,head);
//        printList(newHead);
//        Node newHead1=insertAtLast(data,head);
//        printList(newHead1);
        int k=3;
        Node newHead2=insertAfterK_thNode(head,data,k);
        printList(newHead2);
    }

    private static Node insertAfterK_thNode(Node head, int data, int k) {
        int count=1;
        Node current=head;

        while(current!=null && count<k){
            current=current.next;
            count++;
        }

        if(current!=null){
            Node newNode=new Node(data);

            newNode.next=current.next;
            current.next=newNode;
        }

        return head;
    }

    private static Node insert(int data) {
        return new Node(data);
    }

    private static Node insertAtFront(int data,Node head){

        Node newNode=new Node(data);
        newNode.next=head;
        return newNode;
    }
    private static Node insertAtLast(int data,Node head){
        Node newNode=new Node(data);

        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;

        return head;
    }

    private static void printList(Node head)
    {
        Node curr = head;
        while (curr != null) {
            System.out.print("head->");
            System.out.print(" " + curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
