public class QueueUsingArrays
{
    int data[];
    int front;
    int size;

    public QueueUsingArrays(int cap){
        this.data = new int[cap];
        this.front=0;
        this.size=0;

    }

    // getfront elements
    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }

        return data[front];
    }
    // Is Queue Full 
    public boolean isFull(){
        return size==data.length;
    }

    // Adding elements in Queue (enqueue)
    public void enqueue(int val) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full!");
        }
        
        int idx = size+front;
        data[idx] = val;
        size++;

    }

    // is queue Empty
    public boolean isEmpty(){
        return size==0;
    }

    // Deleting elements from front of the queue
    public int dequeue() throws Exception{
        
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        
        int temp = data[front];
        data[front] = 0;
        size--;
        front++;

        return temp;
    }


    // // display        (not updated / correct)
    // public void display(){
    //     for(int i=0; i<data.length; i++){
    //         System.out.println(data[i]);
    //     }
    // }


    public static void main(String[] args) throws Exception {
		QueueUsingArrays q = new QueueUsingArrays(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        // q.enqueue(60);
        System.out.println();

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.size+" "+ q.front);
        // System.out.println(q.dequeue());         //Queue is empty

        // System.out.println(q.getFront());       //  Queue is empty

	}
}
