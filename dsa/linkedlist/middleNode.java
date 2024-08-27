package com.dsa.linkedlist;

public class middleNode {

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

        Node newHead=insertAtFront(data,head);
        printList(newHead);
        Node middleNode=findMiddle(newHead);
        System.out.println("Middle Node:- "+middleNode.data);

    }

    private static Node findMiddle(Node head) {

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    private static Node insertAtFront(int data, Node head){

       Node newNode=new Node(data);
        newNode.next=head;
        return newNode;
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
