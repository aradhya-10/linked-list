class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
	
	public static void display(Node head) {
		Node current = head;
        while (current != null) {
			System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

	public static void main(String[] args) {
		// Create a simple linked list
		Node head = new Node(56);
		head.next = new Node(30);
		head.next.next = new Node(70);

		display(head);
	}
}
