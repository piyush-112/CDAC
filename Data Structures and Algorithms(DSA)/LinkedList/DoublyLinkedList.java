import java.util.Scanner;

class DoublyLinkedList {
    // Node class for doubly linked list
    static class Node {
        int data;
        Node next;
        Node prev;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    private Node head;

    // Function to insert a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    // Function to insert a new node at the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // Function to delete a node from the list
    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    // Function to print the list from the beginning
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            DoublyLinkedList dll = new DoublyLinkedList();

            // Append nodes
            System.out.println("Enter the number of elements to append:");
            int appendCount = sc.nextInt();
            System.out.println("Enter the elements to append:");
            for (int i = 0; i < appendCount; i++) {
                int ele = sc.nextInt();
                dll.append(ele);
            }

            // Print the list after appending nodes
            System.out.println("List after appending nodes:");
            dll.printList();

            // Prepend nodes
            System.out.println("Enter the number of elements to prepend:");
            int prependCount = sc.nextInt();
            System.out.println("Enter the elements to prepend:");
            for (int i = 0; i < prependCount; i++) {
                int ele = sc.nextInt();
                dll.prepend(ele);
            }

            // Print the list after prepending nodes
            System.out.println("List after prepending nodes:");
            dll.printList();

            // Delete a node
            System.out.println("Enter the element to delete:");
            int deleteElement = sc.nextInt();
            dll.deleteNode(deleteElement);

            // Print the list after deleting a node
            System.out.println("List after deleting node with data " + deleteElement + ":");
            dll.printList();

            // Try deleting a non-existent node
            System.out.println("Enter a non-existent element to delete:");
            int nonExistentElement = sc.nextInt();
            dll.deleteNode(nonExistentElement);
        }
    }
}
