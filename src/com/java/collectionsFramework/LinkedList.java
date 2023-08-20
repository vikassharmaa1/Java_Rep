package com.java.collectionsFramework;

public class LinkedList {
			 
		   static Node head;
		 
		    public static class Node {
		 
		        int data;
		        Node next;
		 
		       public Node(int d) {
		            data = d;
		            next = null;
		        }
		    }
		 
		    /* Function to reverse the linked list */
		    public Node reverse(Node node) {
		        Node prev = null;
		        Node current = node;
		        Node next = null;
		        while (current != null) {
		            next = current.next;
		            current.next = prev;
		            prev = current;
		            current = next;
		        }
		        node = prev;
		        return node;
		    }
		 
		    // prints content of double linked list
		    void printList(Node node) {
		        while (node != null) {
		            System.out.print(node.data + " ");
		            node = node.next;
		        }
		    }
		 
		    public static void main(String[] args) {
		        LinkedList list = new LinkedList();
		        LinkedList.head = new Node(85);
		        LinkedList.head.next = new Node(15);
		        LinkedList.head.next.next = new Node(4);
		        LinkedList.head.next.next.next = new Node(20);
		         
		        System.out.println("Original Linked list is :");
		        list.printList(head);
		        head = list.reverse(head);
		        System.out.println("");
		        System.out.println("Reversed linked list : ");
		        list.printList(head);
		    }
		}

	


