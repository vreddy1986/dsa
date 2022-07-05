package _4.LinkedLists._2_DLL;

import java.sql.SQLOutput;

public class DLL {
    Node head;

    public DLL(){
        this.head = null;
    }

    public void insertAtHead(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertAtTail(int data){
        if(head == null){
            insertAtHead(data);
            return;
        }

        Node node = head;
        while(node.next != null){
            node = node.next;
        }

        Node newNode = new Node(data);
        newNode.prev = node;
        node.next = newNode;
    }

    public void insertAtIndex(int index, int data){
        if(index == 0){
            insertAtHead(data);
            return;
        }

        if(index > (this.size()-1)){
            System.out.println("Index Out of range");
            return;
        }

        Node node = head;
        int counter = 0;
        while (counter < index-1){
            node = node.next;
            counter++;
        }

        Node newNode = new Node(data);
        newNode.next = node.next;
        newNode.prev = node;
        node.next = newNode;
        newNode.next.prev = newNode;
    }

    public int deleteAtHead(){
        if(this.size()==0){
            return -1;
        }

        if(this.size()==1){
            int value = head.data;
            head = null;
            return value;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        return value;
    }

    public int deleteAtTail(){
        if(this.size()==0){
            return -1;
        }

        if(this.size()==1){
            int value = head.data;
            head = null;
            return value;
        }

        Node node = head;
        while(node.next.next != null){
            node = node.next;
        }

        int value = node.next.data;
        node.next = null;
        return value;
    }

    public int deleteAtIndex(int index){
        if(index == 0){
            return deleteAtHead();
        }

        if(index > this.size()-1){
            return -1;
        }

        Node node = head;
        int counter = 0;
        while(counter < index-1){
            node =  node.next;
            counter++;
        }
        int data = node.next.data;
        node.next.next.prev = node;
        node.next = node.next.next;
        return data;
    }



    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.data +" --> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node node = head;
        while(node.next!= null){
            node = node.next;
        }

        while(node!= null){
            System.out.print(node.data + " --> ");
            node = node.prev;
        }
        System.out.println("END");
    }

    public int size(){
        Node node = head;
        int counter=0;
        while(node!= null){
            node = node.next;
            counter++;
        }
        return counter;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public Node search(int data){
        if(head == null){
            return new Node(-1);
        }
        Node node = head;
        while(node != null){
            if(node.data == data){
                return node;
            }
            node = node.next;
        }
        return new Node(-1);
    }

    public void deleteElement(int data){
        if(head == null){
            System.out.println("LL Is empty");
            return;
        }

        Node current = head;
        if(current != null && current.data == data){
            head = head.next;
            head.prev = null;
        }

        while(current!= null && current.data != data){
            current = current.next;
        }

        if(current == null){
            System.out.println("Element not found");
            return;
        }

        if(current.next == null){
            current.prev.next = null;
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;

    }
}
