// Implementation of LinkedList

public class LinkedList
{   
    class Node{

        int val;
        Node next;

    // }
    public  Node(int val){
        this.val = val;
    }
    }

    Node head;      // initially head is null
    Node tail;     // initially tail is null
    int size;
    
    // addAtFirst
    public void addAtFirst(int value){

        Node nn  = new Node(value);

        if(size == 0){
            head = nn;
            tail = nn;
            size++;

        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }

    }


    // addAtLast
    public void addAtLast(int value){
        Node nn = new Node(value);
        if(size == 0){
            addAtFirst(value);

        }else{
            tail.next = nn;
            tail = nn;
            size++;

        }
    }
    
    // getLastNodeValue()
    public int getLastNodeValue()throws Exception{
        if(size == 0){
            throw new Exception("LinkedList is empty!");
        }
        return tail.val;

    } 


    // getFirstNodeValue()
    public int getFirstNodeValue()throws Exception{
        if(size == 0){
            throw new Exception("LinkedList is empty!");
        }
        return head.val;

    } 


    // getNodeValueAtIndex
    public int getNodeValueAtIndex(int idx) throws Exception{

        if(idx<0 || idx>=size){
            throw new Exception("Invalid Index");
        }
        if(size == 0){
            throw new Exception("LinkedList is empty!");
        }

        Node i=head;
        for(int k=1; k<=idx; k++){
            i=i.next;
        }
        return i.val;
    }


    // getNodeAtIndex
    public Node getNodeAtIndex(int idx) throws Exception{

        if(idx<0 || idx>=size){
            throw new Exception("Invalid Index");
        }
        if(size == 0){
            throw new Exception("LinkedList is empty!");
        }

        Node i=head;
        for(int k=1; k<=idx; k++){
            i=i.next;
        }
        return i;       // address of typed node will returned
    }

    
    // addAtIndex
    public void addAtIndex(int val, int idx) throws Exception{

        // Node nn = new Node(val);
        // Node prev = getNodeAtIndex(idx-1);           // can also used here...

        if(idx<0 || idx>size){
            throw new Exception("invalid Index");
        }

        if(size == 0){
            addAtFirst(val);

        }else if(idx==size){
            addAtLast(val);
        }else{

        Node nn = new Node(val);
        Node prev = getNodeAtIndex(idx-1);      // (idx-1)th node
        Node prevNext = prev.next;
        prev.next=nn;
        nn.next=prevNext;
        size++;
        }
    }


    // deleteFirst
    public int deleteFirst()throws Exception{

        if(size == 0){
            throw new Exception("LinkedList is empty");
        }

        if(size == 1){
            tail = null;
        }

        Node i = head;
        head = head.next;
        i.next=null;
        size--;
        return i.val;
    }


    // deleteLast
    public int deleteLast() throws Exception{

    
    if(size == 0){
        throw new Exception("LinkedList is empty");
    }

    if(size == 1){
        return deleteFirst();

    }else{

        Node secLast = getNodeAtIndex(size-2);

        int temp = tail.val;
        secLast.next = null;
        tail=secLast;
        size--;

        return temp;
    }
    }

    public void display(){

        Node i = head;
        while(i!=null){
            System.out.print(i.val + " --> ");
            i=i.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) throws Exception {
		
        LinkedList ll = new LinkedList();
        
        // System.out.println(ll.getLastNodeValue());
        ll.addAtFirst(10);
        ll.addAtFirst(20);
        ll.addAtFirst(30);
        ll.display();

        ll.addAtLast(1);
        ll.addAtLast(50);
        ll.display();
        
        System.out.println(ll.getLastNodeValue());
        System.out.println(ll.getFirstNodeValue());

        System.out.println(ll.getNodeValueAtIndex(2));
        // System.out.println(ll.getNodeValueAtIndex(0));
        // System.out.println(ll.getNodeValueAtIndex(5));

        System.out.println(ll.getNodeAtIndex(2));

        ll.addAtIndex(40,4);
        ll.display();

        System.out.println(ll.size);

        System.out.println(ll.deleteFirst());
        // System.out.println(ll.deleteFirst());
        ll.display();
    
        System.out.println(ll.deleteLast());
        ll.display();
    
	}
}
