package _4.LinkedLists._1_SLL;

public class SLL {
    Node head;

    public SLL(){
        this.head = null;
    }

    public void insertAtHead(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAtTail(int data){
        Node node = head;
        while(node.next != null){
            node = node.next;
        }

        Node newNode = new Node(data);
        node.next = newNode;
    }

    public void insertAtIndex(int index, int data){
        if(index == 0){
            insertAtHead(data);
            return;
        }

        if(index > this.size()-1){
            System.out.println("Index greater than LL Size, hence cannot insert");
            return;
        }

        Node node = head;
        int counter = 0;

        while(counter < index-1){
            node = node.next;
            counter++;
        }

        Node newNode = new Node(data);
        newNode.next = node.next;
        node.next = newNode;
    }

    public int deleteAtHead(){
        int data = head.data;
        head = head.next;
        return data;
    }

    public int deleteAtTail(){
        Node node = head;
        while(node.next.next != null){
            node = node.next;
        }
        int data = node.next.data;
        node.next = null;
        return data;
    }

    public int deleteAtIndex(int index){
        if(index == 0){
            return deleteAtHead();
        }

        if(index > this.size()-1){
            System.out.println("Index greater than LL Size, hence cannot delete");
            return -1;
        }

        Node node = head;
        int counter = 0;
        while(counter < (index-1)){
            node = node.next;
            counter++;
        }
        int data = node.next.data;
        node.next = node.next.next;
        return data;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public boolean search(int data){
        Node node = head;
        while(node != null){
            if(node.data == data){
               return true;
            }
            node = node.next;
        }
        return false;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public int size(){
        Node node = head;
        int counter = 0;
        while(node != null){
            node = node.next;
            counter++;
        }
        return counter;
    }

    public void deleteElement(int data) {
        //check if head is null
        if (head == null) {
            System.out.println("LL Is empty");
            return;
        }

        Node current = head, prev = null;

        // If head node itself holds the key to be deleted
        if (current != null && current.data == data) {
            head = current.next; // Changed head
            return;
        }

        //Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        //Key not found
        if (current == null) {
            System.out.println("Element not found");
            return;
        }

        prev.next = current.next;
    }
}
