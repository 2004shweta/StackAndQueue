class MyQueue {

    int front, rear;
	int arr[];
	int cap=100005;
	int size;

    MyQueue()
	{
		arr= new int[size];
		front=0;
		rear=-1;
		size=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    if(size==arr.length){
	      
	    }
	    else{
	        rear=(rear+1)%arr.length;
	        arr[rear]=x;
	        size++;
	    }
	    
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		    if (size == 0) {
            return -1;
        } else {
            int poppedElement = arr[front];
            front = (front + 1) % arr.length;
            size--;
            return poppedElement;
        }
	} 
}


