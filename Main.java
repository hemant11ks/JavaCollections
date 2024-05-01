// Define a class for the node of the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define a class for the singly linked list
class SinglyLinkedList {
    private Node head; // Head node of the linked list

    // Method to insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Make the new node point to the current head
        head = newNode; // Make the new node as the new head
    }

    // Method to delete a node with given key
    public void delete(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Change head
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Method to print the linked list
    public void display() {
        Node current = head; // Start from the head node
        while (current != null) { // Traverse till the end of the list
            System.out.print(current.data + " "); // Print the data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a new line at the end
    }
}

// Main class to test the singly linked list implementation
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new linked list

        // Insert some elements at the beginning of the list
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);

        // Display the initial linked list
        System.out.println("Initial Linked List:");
        list.display(); // Output: 4 3 2 1

        // Delete a node with key 3
        list.delete(3);

        // Display the modified linked list
        System.out.println("Linked List after deletion of 3:");
        list.display(); // Output: 4 2 1
    }
}
