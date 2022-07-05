package _4.LinkedLists._1_SLL;

public class Demo {
    public static void main(String[] args) {
        SLL sll = new SLL();

        System.out.println("\n------Checking for Empty------");
        System.out.println(sll.isEmpty());

        System.out.println("\n------Checking for Size------");
        System.out.println(sll.size());

        System.out.println("\n------Inserting at Head------");
        sll.insertAtHead(5);
        sll.insertAtHead(3);
        sll.display();

        System.out.println("\n------Inserting at Tail------");
        sll.insertAtTail(35);
        sll.insertAtTail(77);
        sll.display();

        System.out.println("\n------Inserting at Index------");
        sll.insertAtIndex(2,21);
        sll.insertAtIndex(3,55);
        sll.display();
        sll.insertAtIndex(50, 100);
        sll.insertAtIndex(6, 700);
        sll.insertAtIndex(5, 700);
        sll.display();

        System.out.println("\n------Checking for Empty------");
        sll.display();
        System.out.println(sll.isEmpty());

        System.out.println("\n------Checking for Size------");
        sll.display();
        System.out.println(sll.size());

        System.out.println("\n------Searching for data------");
        sll.display();
        System.out.println(sll.search(21));
        System.out.println(sll.search(212));

        System.out.println("\n------Delete at head------");
        sll.display();
        System.out.println(sll.deleteAtHead());
        System.out.println(sll.deleteAtHead());
        sll.display();

        System.out.println("\n------Delete at head------");
        sll.display();
        System.out.println(sll.deleteAtTail());
        System.out.println(sll.deleteAtTail());
        sll.insertAtHead(43);
        sll.insertAtTail(34);
        sll.display();

        System.out.println("\n------Delete at Index------");
        sll.deleteAtIndex(3);
        sll.display();
        sll.deleteAtIndex(2);
        sll.display();


        System.out.println("\n------Delete a Node------");
        sll.display();
        sll.deleteElement(21);
        sll.display();
        sll.deleteElement(34);
        sll.display();
        sll.deleteElement(43);
        sll.display();
        sll.deleteElement(100);
        sll.display();
    }
}
