public class LinearSearch<T> {
    
    public static <T> int linearSearch(T[] array, T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1; // Key not found
    }
    
    public static void main(String[] args) {
        Character[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        Character key = 'c';
        int result = linearSearch(charArray, key);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
