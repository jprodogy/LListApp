import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Random;

public class LList {
    private MyNode head;    // a list is a head node and any linked nodes

    /**
     * parameterized constructor that takes an int
     * @param data the value of the head node
     */
    public LList(int data) {
        head = new MyNode(data);
    }

    /**
     * parameterized constructor that converts a MyNode object to a LList
     * @param node the value of the head node
     */
    public LList(MyNode node) {
        head = node;
    }

    /**
     * attach an int to the back of the linked list
     * @param data the value to be appended to the list
     */
    public void append(int data) {
        MyNode temp = head;

        while(temp.next != null)
            temp = temp.next;

        temp.next = new MyNode(data);
    }

    public int size(){
        int size = 0;
        MyNode temp = head;
        while(temp != null){
            size ++;
            temp = temp.next;
        }
        return size;
    }

    public LList intialize(int numOfNodes, int maxValue){
        Random rand = new Random();
        LList nList = new LList(rand.nextInt(maxValue));
        for (int i = 0; i < numOfNodes - 1; i++) {
           nList.append(rand.nextInt(maxValue));
        }
        return nList;
    }

    public void prepend(int data){
        MyNode temp = head;
        head = new MyNode(data);
        head.next = temp;
    }

    public void insert(int value, int position){
        MyNode temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }

    }

    /**
     * the list without the head node
     * @return the rest of the list
     */
    public LList next() {
        if(head.next == null)
            return null;
        return new LList(head.next);
    }

    /**
     * pretty-print my linked list object
     * @return the linked list represented as a String
     */
    @Override
    public String toString() {

        if( head.next == null )
            return Integer.toString(head.value);
        else
            return head.value + "-" + next().toString();
    }
}
