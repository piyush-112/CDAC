import java.util.LinkedList;
import java.util.Queue;
public class QueueExUsingLinkedList {
    public static void main(String[] args) {
            Queue<Integer> q = new LinkedList<>();
    
            // Enqueue elements
            q.add(50);
            q.add(40);
            q.add(15);
            
            // Peek at the front element
            System.out.println("Front element is: " + q.peek());
    
            // Dequeue elements
            System.out.println("Removed element: " + q.remove());
            //print the queue
            System.out.println("Front element is: " + q.peek());
    
            // Check if queue is empty
            System.out.println("Queue is empty: " + q.isEmpty());
    }
}
