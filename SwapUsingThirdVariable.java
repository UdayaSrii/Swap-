public class SwapUsingThirdVariable {
    // Create a method to swap two numbers using a third variable
    public static void main(String[] args) {
        // The numbers to be swapped
        int first = 10;
        int second = 20;
        // The third variable to hold the first number
        System.out.println("Before swapping:");
        System.out.println("First variable: " + first);
        System.out.println("Second variable: " + second);
        // The third variable holds the first number
        int temp = first; // The third variable holds the first number
        first = second;   // The first variable holds the second number
        second = temp;    // The second variable holds the first number
        // Print the swapped numbers
        System.out.println("\nAfter swapping:");
        System.out.println("First variable: " + first);
        System.out.println("Second variable: " + second);
    }
}

