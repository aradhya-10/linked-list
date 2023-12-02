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

	public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

	public void insertAfter(int prevData, int data) {
		Node headd = head;
		if(headd == null)
			this.append(data);
		while(headd.next != null && prevData!=headd.data)
			headd = headd.next;
        Node newNode = new Node(data);
        newNode.next = headd.next;
    	headd.next = newNode;
    }

	public void pop() {
        if (head != null) {
            head = head.next;
        }
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
        linkedList.insertBefore(50);
        linkedList.insertBefore(60);
        linkedList.insertAfter(50, 56);

        linkedList.display();
        linkedList.pop();
        linkedList.display();
	}
}
