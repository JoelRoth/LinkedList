package LinkedList;

public class LinkedListSort {

	public static void main(String[] args) {
		
		Node n = new Node(6, null);
		Node n2 = new Node(9, null);
		Node n3 = new Node(5, null);
		Node n4 = new Node(8, null);
		Node n5 = new Node(7, null);
		n.Next = n2;
		n2.Next = n3;
		n3.Next = n4;
		n4.Next = n5;
		LinkedList list = new LinkedList();
		list.Head = n;
		Node nah = new Node(1, null);
		list.Push(nah);
		list.Print();
		list.bubbleSort();
		list.Print();
		
	}

}
