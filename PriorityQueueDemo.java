import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the priority queue
        pq.offer(5);
        pq.offer(9);
        pq.offer(1);
        pq.offer(3);
        pq.offer(7);

        // Printing the elements of the priority queue
        System.out.println("Priority Queue: " + pq);

        // Peek: Get the highest priority element without removing it
        System.out.println("Peek: " + pq.peek());

        // Poll: Remove and return the highest priority element
        System.out.println("Poll: " + pq.poll());

        // Printing the elements after polling
        System.out.println("Priority Queue after polling: " + pq);

        // Adding another element
        pq.offer(2);
        System.out.println("Priority Queue after adding another element: " + pq);

        // Size: Get the size of the priority queue
        System.out.println("Size: " + pq.size());

        // Checking if the priority queue is empty
        System.out.println("Is empty? " + pq.isEmpty());

        // Removing all elements from the priority queue
        pq.clear();
        System.out.println("Priority Queue after clearing: " + pq);
    }
}
