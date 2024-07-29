class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList11 {
    private Node head;
    
    public SinglyLinkedList11() {
        this.head = null;
    }
    
    // Method to add element X at the end of the list
    public void add(int X) {
        Node newNode = new Node(X);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    // Method to add element X at index i
    public void add(int X, int i) {
        Node newNode = new Node(X);
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index must be non-negative");
        } else if (i == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int position = 0;
            while (current != null && position < i - 1) {
                current = current.next;
                position++;
            }
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    // Method to remove all occurrences of element X from the list
    public void remove(int X) {
        Node current = head;
        Node prev = null;
        
        while (current != null) {
            if (current.data == X) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
    }
    
    // Method to display all elements in the list
    public void list() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
    }
    
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        
        // Adding elements
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        
        // Displaying elements
        System.out.print("Original list: ");
        myList.list();
        
        // Adding element at index 2
        myList.add(10, 2);
        
        // Displaying elements
        System.out.print("List after adding 10 at index 2: ");
        myList.list();
        
        // Removing element 3
        myList.remove(3);
        
        // Displaying elements
        System.out.print("List after removing element 3: ");
        myList.list();
        
        // Reversing the list
        myList.reverse();
        
        // Displaying elements
        System.out.print("Reversed list: ");
        myList.list();
    }
}
