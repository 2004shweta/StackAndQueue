class MyStack {
    private int[] arr;
    private int top;
    int size=1000;

    public MyStack() {
        arr = new int[size];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if (top >= size - 1) { // Check if stack is full
            // System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        // Your Code
          if (top == -1) { // Check if stack is empty
            // System.out.println("Stack underflow");
            return -1; // Returning -1 to indicate an empty stack (could also throw an exception)
        }
        int x = arr[top];
        top--;
        return x;
    }
     int top() {
           if (top == -1) { // Check if stack is empty
            System.out.println("Stack is empty");
            return -1; // Returning -1 to indicate an empty stack (could also throw an exception)
        }
        return arr[top];
    }
    int size() {
        return top + 1;
    }
}
