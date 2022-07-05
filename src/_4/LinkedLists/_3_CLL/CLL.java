package _4.LinkedLists._3_CLL;

public class CLL {
    Node head;
    Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        }else{
           newNode.next = head;
           head = newNode;
           tail.next = newNode;
        }
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertAtHead(data);
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtIndex(int index, int data){
        if(index==0){
            insertAtHead(data);
            return;
        }

        if(index > (this.size()-1)){
            System.out.println("Index out of bound");
            return;
        }

        if(index == (this.size()-1)){
            insertAtTail(data);
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


    // Start from Head, print atleast once, iterate till we dont reach it again
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.data + " --> ");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("END");
    }


    public int deleteAtHead(){
        if(head == null){
            return -1;
        } else {
            if(head == tail){
                head = tail = null;
                return -1;
            } else {
                int data = head.data;
                head = head.next;
                tail.next = head;
                return data;
            }
        }
    }


    public int deleteAtTail(){
        if(head == null){
            return -1;
        } else {
            if(head == tail){
                head = tail = null;
                return -1;
            } else {
               Node node = head;
               while(node.next != tail){
                   node = node.next;
               }

               int data = node.next.data;
               tail = node;
               tail.next = head;
               return data;
            }
        }
    }

    public int deleteAtIndex(int index){
        if(index == 0){
            return deleteAtHead();
        }

        if(index > this.size()-1){
            return -1;
        }

        if(index == this.size()-1){
            return deleteAtTail();
        }

        Node node = head;
        int counter = 0;
        while(counter < index-1){
            node = node.next;
            counter ++;
        }

        int data = node.next.data;
        node.next = node.next.next;
        return data;
    }

    public Node search(int data){
        if(head == null) {
            return new Node(-1);
        }

        Node node = head;
        do{
            if(node.data == data){
                return node;
            }
            node = node.next;
        }while(node != head);

        return new Node(-1);
    }

    public int size(){
        Node node = head;
        int size=0;
        if(head != null){
            do{
                size++;
                node = node.next;
            }while(node!=head);
        }
        return size;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public void deleteElement(int data){
        if(head == null)
            return;

        Node current = head, prev = null;
        if(current.data == data){
            head = head.next;
            tail = head;
        }

        do{
            if(current.data == data)
                break;
            prev = current;
            current = current.next;
        }while(current != head);

        if(current == head){
            System.out.println("Element not found");
            return;
        }

        prev.next = current.next;
    }
}

