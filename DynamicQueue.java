// Dyanamic Queue     


public class QueueUsingArrays
{
    int data[];
    int front;
    int size;

    public QueueUsingArrays(){
        this.data = new int[5];
        this.front = 0;
        this.size = 0;
    }

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
        idx = idx % data.length;                // after complete queue, restart from 1st is happen
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
        front = front % data.length;

        return temp;
    }


    // display (Correct way)
    public void display(){
        for(int i=0; i<data.length; i++){
            int idx = i+front;
            idx = idx % data.length;
            
            System.out.print(data[idx] + " ");
        }
    }




    public static class DynamicQueue extends QueueUsingArrays{

        public void enqueue(int val) throws Exception{

            if(size == data.length){
                int newData[] = new int[data.length*2];

                for(int i=0; i<data.length; i++){
                    int idx = i+front;
                    idx = idx % data.length;

                    newData[i] = data[idx];
                }

                data = newData;
                front=0;
            }

            super.enqueue(val);

        }
    }




    public static void main(String[] args) throws Exception {
		// QueueUsingArrays q = new QueueUsingArrays(6);
        // q.enqueue(0);
        // q.enqueue(10);
        // q.enqueue(20);
        // q.enqueue(30);
        // q.enqueue(40);
        // q.enqueue(50);
        // q.display();
        // // q.enqueue(60);
        // System.out.println();

        // System.out.println(q.dequeue());        // 10(front) is deleted
        // System.out.println(q.dequeue());
        // System.out.println();

        // q.enqueue(60);                          // 60 is added at the place of 10
        // q.enqueue(70);
        // q.display();
        // // System.out.println();

        // // System.out.println(q.dequeue());
        // // System.out.println(q.dequeue());
        // // System.out.println(q.dequeue());
        // // System.out.println(q.size+" "+ q.front);
        // // System.out.println(q.dequeue());       // this from starting will be delete 
        // // System.out.println(q.dequeue());
        
        // // System.out.println(q.dequeue());         //Queue is empty

        // // System.out.println(q.getFront());       //  Queue is empty
        



        DynamicQueue q = new DynamicQueue();
        // q.enqueue(0);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        // q.enqueue(60);
        System.out.println();

        System.out.println(q.dequeue());        // 10(front) is deleted
        System.out.println(q.dequeue());
        System.out.println();

        q.enqueue(60);                          // 60 is added at the place of 10
        q.enqueue(70);
        q.enqueue(80);
    
        q.display();
        System.out.println();

        q.enqueue(90);
        q.enqueue(100);
        q.enqueue(110);
        q.enqueue(120);
        q.enqueue(130);

        q.display();    
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.size+" "+ q.front);
        // System.out.println(q.dequeue());       // this from starting will be delete 
        // System.out.println(q.dequeue());
        
        // System.out.println(q.dequeue());         //Queue is empty

        // System.out.println(q.getFront());   

	}
}
