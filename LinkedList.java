class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head;

	List(int data) {
		Node list = new Node(data);
		head = list;
	}

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

	// public void insertBefore(Node nextNode, int data) {
	public void insertBefore(int data) {
        // if (prevNode == null) {
        //     System.out.println("Last node cannot be null");
        //     return;
        // }
		// while(headd.next != nextNode)
		// 	headd = headd.next;
		// Node headd = head;
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

	 public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {

		List linkedList = new List(70);
        linkedList.insertBefore(30);
        linkedList.insertBefore(56);

        linkedList.display();
	}
}
