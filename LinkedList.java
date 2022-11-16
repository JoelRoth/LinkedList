package LinkedList;

public class LinkedList {

	public Node Head;
	
	public void Print() {
		Node current = this.Head;
		do {
			System.out.print(current.Value + " ");
			current = current.Next;
		} while(current != null);
		System.out.println();
	}
	public void Push(Node nah) {
		nah.Next = Head;
		Head = nah;
		
	}
	public void swapWithNext(Node n, Node prev) {
		Node next = n.Next;
		Node nextnext = next.Next;
		n.Next = nextnext;
		prev.Next = next;
		next.Next = n;
	}
	public void swapHeadWithNext() {
		Node current = Head;
		Node next = current.Next;
		Node nextnext = next.Next;
		Head = next;
		next.Next = current;
		current.Next = nextnext;
	}
	public void bubbleSort() {
		boolean didSwap = true;
		while(didSwap) {
			Node current = Head;
			Node prev = null;
			didSwap = false;
			while(current.Next.Next != null) {
				System.out.println(current.Value);
				Print();
				if(current.Value > current.Next.Value) {
					
					if(current == Head) {
						prev = Head.Next;
						swapHeadWithNext();
						
					}
					else {
						swapWithNext(current, prev);
						prev = prev.Next;
					}
					
					
					didSwap = true;
				}
				else {
					prev = current;
					current = current.Next;
					
				}
				
			}
			

		}
		
	}
}
//swapWithNext - swap adjacent nodes