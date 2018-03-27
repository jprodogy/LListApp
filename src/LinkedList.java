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
        int size = 0;
        while(temp != null){
            size++;
        }
        return size;
    }

    public void insert(int value, int position){
        Node temp = head;
        Node prev = temp;
        if (position == 0){
            append(value);
        }else if (position <= size() || position >=  -1){
            System.out.println("This is invalid");
        }else{
            for (int i = 0; i < position; i++) {
                prev = temp;
                temp = temp.next;
            }
            temp = new Node(value);
            temp.next = prev;
            prev.next = temp;
        }
    }

    public void remove(int position){
        Node temp = head;
        Node prev = temp;
        if(position == 0){
            head = null;
            head = temp.next;
        }else {
            for (int i = 0; i < position; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
    }
}
