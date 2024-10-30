class Node {
    int data;   // Data part of the node
    Node next;  // Pointer to the next node

    Node(int data) {
        this.data = data;
        this.next = null; // Initialize next as null
    }
}

class MyStack {
    Node top; // Pointer to the top node of the stack

    MyStack() {
        this.top = null; // Initialize the stack as empty
    }

    // Method to push an element onto the stack
    public void push(int x) {
        Node newNode = new Node(x); // Create a new node with the given value
        newNode.next = top;         // Link the new node to the current top
        top = newNode;              // Update top to the new node
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == null) {
            return -1; // Stack is empty
        } else {
            int poppedValue = top.data; // Get the data from the top node
            top = top.next;              // Move the top pointer to the next node
            return poppedValue;          // Return the popped value
        }
    }
}
