import java.util.Deque;
import java.util.ArrayDeque;

public class DequeueMethod {

    public static void main(String[] args) {
        // Creating a Deque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the Deque
        deque.add("Element 1"); // Add element to the end
        deque.addFirst("Element 2"); // Add element to the front
        deque.addLast("Element 3"); // Add element to the end

        System.out.println("Deque after adding elements: " + deque);

        // Removing elements from the Deque
        String firstElement = deque.remove(); // Remove and return the first element
        String lastElement = deque.removeLast(); // Remove and return the last element

        System.out.println("Removed first element: " + firstElement);
        System.out.println("Removed last element: " + lastElement);
        System.out.println("Deque after removing elements: " + deque);

        // Retrieving elements without removing them
        String first = deque.getFirst(); // Get the first element
        String last = deque.getLast(); // Get the last element

        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
        System.out.println("Deque after retrieving elements: " + deque);

        // Checking if Deque is empty
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is Deque empty? " + isEmpty);

        // Size of the Deque
        int size = deque.size();
        System.out.println("Size of Deque: " + size);

        // Clearing the Deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}
