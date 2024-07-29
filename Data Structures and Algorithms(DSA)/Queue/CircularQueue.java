import java.util.Scanner;

class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    public CircularQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Overflow: Queue is full.");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Utility function to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow: Queue is empty.");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // Utility function to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }

    // Utility function to check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Utility function to check if the queue is full
    public boolean isFull() {
        return (count == capacity);
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of the queue:");
            CircularQueue q = new CircularQueue(sc.nextInt());   //i/p the size of the queue

            //Input the element into the queue
            System.out.println("Enter the Element into the queue:");
            for(int i=0;i<q.capacity;i++){
                int ele=sc.nextInt();
                q.enqueue(ele);
            }

            //print the front element of the queue
            System.out.println("Front element is: " + q.peek());
            q.dequeue();   //Remove one element
            System.out.println("Front element after removing one ele is: " + q.peek());   //Again print the peek
            System.out.println("Enter the new Eleement:");
            q.enqueue(sc.nextInt());  //add the element
            System.out.println("Queue size is " + q.size());    //Print the size of the Queue

            //remove all element from the queue
            for(int i=0;i<q.capacity;i++){
                q.dequeue();
            }

            //Check the Queue is empty or not
            System.out.println("Queue is empty: " + q.isEmpty());
        }
    }
}
