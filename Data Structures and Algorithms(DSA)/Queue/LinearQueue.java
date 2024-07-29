/*
 -The last position in the queue is connected to the first position, making the queue circular
 -Fixed in size
 Key Points to Remember:
 -Initialization: Set front to 0, rear to -1, and count to 0.
-Wrap-around: Use (index + 1) % capacity to handle wrap-around for both enqueue and dequeue operations.
-Full and Empty Conditions:
  Full: When count equals capacity.
  q Empty: When count is 0.
 */
import java.util.Scanner;

class LinearQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    public LinearQueue(int size) {
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
        rear++;
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
        // Shift all elements to the left by one position
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
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
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the queue:");
            LinearQueue q = new LinearQueue(sc.nextInt());   // Input the size of the queue

            // Input the element into the queue
            System.out.println("Enter the elements into the queue:");
            for (int i = 0; i < q.capacity; i++) {
                int ele = sc.nextInt();
                q.enqueue(ele);
            }

            // Print the front element of the queue
            System.out.println("Front element is: " + q.peek());
            q.dequeue();   // Remove one element
            System.out.println("Front element after removing one element is: " + q.peek());   // Again print the peek
            System.out.println("Enter the new element:");
            q.enqueue(sc.nextInt());  // Add the element
            System.out.println("Queue size is " + q.size());    // Print the size of the Queue

            // Remove all elements from the queue
            while (!q.isEmpty()) {
                q.dequeue();
            }

            // Check if the queue is empty
            System.out.println("Queue is empty: " + q.isEmpty());
        }
    }
}
