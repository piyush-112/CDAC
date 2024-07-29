
public class FirstLinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //We create the head nd tail we create the only once bca we have only one head and tail
    public static Node head;
    public static Node tail;

    //We make the methods to do operation,we dont to by ourself to do so we make proper methods
    /*
   add();
   remove();
   print();
   search();
     */
    public void addFirst(int data) {
        //Step 1:create new node
        Node newNode = new Node(data);

        //If suppose the linked list is empty then after performin the 1st step
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //Step 2:store the address of the next node into the newNode
        newNode.next = head;   //Linking

        //Step 3:pointing to the current head
        head = newNode;

    }

    //Add the element at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        FirstLinkedList ll = new FirstLinkedList();
        ll.addFirst(10);    //timeComplexity= O(1) -->Constant time operation
        ll.addFirst(20);
        ll.addLast(80);     //timeComplexity= O(1) -->Constant time operation 
        ll.addLast(33);
    }
}
