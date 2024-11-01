
/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
    
    MyQueue(){
        front=null;
        rear=null;
        
    }
	void push(int a)
	{
        // Your code here
        QueueNode newnode=new QueueNode(a);
        if( rear==null){
            rear=front=newnode;
            return;
        }
            rear.next=newnode;
            rear=newnode;
        
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        if(front==null){
            return -1;
        }
        int poppedValue = front.data;
        front = front.next;          
        if (front == null) {
            rear = null;             
        }
        return poppedValue; 
	}
}
