package _4.LinkedLists._2_DLL;

public class Demo {
    public static void main(String[] args) {
        DLL dll = new DLL();

        System.out.println("\n------Inserting at Head------");
        dll.insertAtHead(5);
        dll.insertAtHead(3);
        dll.insertAtHead(31);
        dll.insertAtHead(43);
        dll.display();

        System.out.println("\n------Inserting at Tail------");
        dll.insertAtTail(57);
        dll.insertAtTail(37);
        dll.display();

        System.out.println("\n------Inserting at Index------");
        dll.display();
        dll.insertAtIndex(3,507);
        dll.display();
        dll.insertAtIndex(2, 1000);
        dll.display();
        dll.insertAtIndex(8, 10000);
        dll.display();

        System.out.println("\n------Display Reverse------");
        dll.displayReverse();

        System.out.println("\n------Delete at Head------");
        dll.display();
        System.out.println(dll.deleteAtHead());
        System.out.println(dll.deleteAtHead());
        dll.display();

        System.out.println("\n------Delete at Tail------");
        dll.display();
        System.out.println(dll.deleteAtTail());
        dll.display();
        System.out.println(dll.deleteAtTail());
        dll.display();
        dll.insertAtHead(77);
        dll.insertAtHead(87);
        dll.display();

        System.out.println("\n------Delete at Index------");
        System.out.println(dll.deleteAtIndex(2));
        dll.display();
        System.out.println(dll.deleteAtIndex(3));
        dll.display();
        System.out.println(dll.deleteAtIndex(4));

        System.out.println("\n------Delete a Node------");
        dll.display();
        dll.deleteElement(77);
        dll.display();
        dll.deleteElement(3);
        dll.display();
        dll.deleteElement(50);
        dll.display();
        dll.deleteElement(5);
        dll.display();
    }
}
