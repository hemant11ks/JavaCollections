import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableMain {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Add elements to the Hashtable
        hashtable.put(1, "John");
        hashtable.put(2, "Alice");
        hashtable.put(3, "Bob");

        // Display the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Get size of the Hashtable
        System.out.println("Size of Hashtable: " + hashtable.size());

        // Check if Hashtable is empty
        System.out.println("Is Hashtable empty? " + hashtable.isEmpty());

        // Check if Hashtable contains a key
        int key = 2;
        System.out.println("Does Hashtable contain key " + key + "? " + hashtable.containsKey(key));

        // Check if Hashtable contains a value
        String value = "Alice";
        System.out.println("Does Hashtable contain value \"" + value + "\"? " + hashtable.containsValue(value));

        // Get value associated with a key
        System.out.println("Value associated with key " + key + ": " + hashtable.get(key));

        // Remove an element from the Hashtable
        int keyToRemove = 3;
        String removedValue = hashtable.remove(keyToRemove);
        System.out.println("Removed element with key " + keyToRemove + ": " + removedValue);

        // Display the Hashtable after removal
        System.out.println("Hashtable after removal: " + hashtable);

        // Iterate through Hashtable using Enumeration
        Enumeration<Integer> keys = hashtable.keys();
        System.out.println("Iterating through Hashtable using Enumeration:");
        while (keys.hasMoreElements()) {
            int k = keys.nextElement();
            System.out.println("Key: " + k + ", Value: " + hashtable.get(k));
        }

        // Clear the Hashtable
        hashtable.clear();
        System.out.println("Hashtable after clearing: " + hashtable);
    }
}
