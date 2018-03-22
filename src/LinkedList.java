import javax.xml.soap.Node;

public class LinkedList {
    private Node head;

    public class Node{
        private int value;
        private Node next;

        public Node(int v, Node n) {
            value = v;
            next = n;
        }

        public Node(int v) {
            new Node(v, null);
        }
    }

    public LinkedList(int v){
        head = new Node(v);
    }

    public void append(int value){
        Node temp = head;
        while(temp.next != null){
            temp.next = temp;
        }
        temp.next = new Node(value);
    }

    public void prepend(int value){
        Node temp = head;
        head = new Node(value);
        head.next = temp;
    }

    public int size(){
        Node temp = head;
        while(temp != null){

        }
    }

    public void insert(){

    }

    public void remove(){

    }


}
