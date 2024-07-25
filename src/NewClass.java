import java.util.Stack;

class LIFOExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Adding elements to the stack (push)
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        // Display the elements of the stack
        System.out.println("Stack: " + stack);

        // Removing elements from the stack (pop)
        System.out.println("Removed: " + stack.pop());
        System.out.println("Stack after removal: " + stack);

        // Peek at the top element without removing it
        System.out.println("Top element: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
