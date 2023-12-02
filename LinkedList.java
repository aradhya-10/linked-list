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

	//UC 8 already implemented 
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

	public void popLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

	public Node search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

	public void delete(int data){
		Node headd = head;
		while(headd.next.next != null && data!=headd.next.data)
			headd = headd.next;
		head.next = head.next.next;
	}

	public void display() {
		int i = 0;
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
			i++;
        }
        System.out.println("null");
        System.out.println("Size of list: "+i);
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
        linkedList.popLast();
        linkedList.display();

		Node searchedNode = linkedList.search(56);
		searchedNode.data = 51;
		linkedList.display();
		
		linkedList.delete(51);
		linkedList.display();
	}
}
