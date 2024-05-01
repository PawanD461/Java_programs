//  Linked List (create a node)

public class no76{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    } 
public Node head;   // here node is a type 
public Node tail;   // here node is a type

public void add(int data){
    // step 1 : Create new node
    Node newNode = new Node(data);

    // if there is no node in linkedList the first node should be added like that
    if(head == null){
        head = tail = newNode;
        return;
    }

    // step 2 : newNode.next = head
    newNode.next = head ; //link with the privious node(head)

    // step 3 : head = newNode (shift the head to the newNode, because newly added node should be the head node) 
    head = newNode;     
}

public void print(){
    
    Node temp = head; 
    while(temp != null){
    System.out.print(temp.data+" ->");
    temp=temp.next;
}
}
public static void main(String[] args) {
    no76 ll = new no76();
    ll.add(1);
    ll.add(2);
    ll.print();
}
}
