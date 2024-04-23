import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Create a Queue using LinkedList implementation
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add(10);  // Adds element at the rear of the Queue
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Displaying the Queue
        System.out.println("Queue: " + queue);

        // Retrieving and removing the head of the Queue using poll() method
        int head = queue.poll();
        System.out.println("Removed element: " + head);
        System.out.println("Queue after removal: " + queue);

        // Retrieving but not removing the head of the Queue using peek() method
        int peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);
        System.out.println("Queue after peek: " + queue);

        // Adding an element at the rear of the Queue using offer() method
        boolean isElementAdded = queue.offer(60);
        System.out.println("Element 60 added successfully? " + isElementAdded);
        System.out.println("Queue after offer: " + queue);

        // Checking if the Queue contains a specific element using contains() method
        boolean isElementFound = queue.contains(30);
        System.out.println("Is 30 present in Queue? " + isElementFound);

        // Getting the size of the Queue using size() method
        int queueSize = queue.size();
        System.out.println("Size of Queue: " + queueSize);

        // Removing all elements from the Queue using clear() method
        queue.clear();
        System.out.println("Queue after clearing all elements: " + queue);
    }
}
