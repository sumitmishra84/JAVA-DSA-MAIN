package LinkList;
import org.w3c.dom.*;
public class Add {
    int data;
    Add next;
    public Add(int data) {
        this.data = data;
        this.next = null;
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data) {
        //step=create a new node
        Add NewNode = new Add(data);
        //setp 2-newNode next =head
        ne.next = head;
    }
    public static void main(String[] args) {

    }
}