package _4.LinkedLists._3_CLL;

public class Demo {
    public static void main(String[] args) {
        CLL cll = new CLL();

        System.out.println("\n------ Inserting at Head ------");
        cll.insertAtHead(5);
        cll.insertAtHead(51);
        cll.insertAtHead(52);
        cll.insertAtHead(53);
        cll.display();

        System.out.println("\n------ Checking the size ------");
        System.out.println(cll.size());

        System.out.println("\n------Inserting at Tail------");
        cll.insertAtTail(61);
        cll.insertAtTail(62);
        cll.insertAtTail(63);
        cll.insertAtTail(64);
        cll.display();

        System.out.println("\n------Inserting at Index------");
        cll.insertAtIndex(3, 31);
        cll.display();
        cll.insertAtIndex(2, 33);
        cll.display();

        System.out.println("\n------ Deleting at Head ------");
        System.out.println(cll.deleteAtHead());
        System.out.println(cll.deleteAtHead());
        cll.display();

        System.out.println("\n------ Deleting an element ------");
        cll.display();
        cll.deleteElement(61);
        cll.display();
        cll.deleteElement(62);
        cll.display();
        cll.deleteElement(64);
        cll.display();
        cll.deleteElement(68);
        cll.display();
    }
}
