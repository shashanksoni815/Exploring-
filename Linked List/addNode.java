// package LinkedList;

public class addNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // create new  node 
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }
        // next = head
        newNode.next = head;
        // head = new node
        head = newNode;
    }


    public static void main(String[] args) {
        System.out.println("hello");
    }
}
