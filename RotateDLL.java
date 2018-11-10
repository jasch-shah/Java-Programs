

class Node{
	int data;
	Node next,prev;
	Node(int num){
		data = num;
		next = null;
		prev = null;

	}
}

class RotateDLL{
	
	Node insert(Node head, int val){
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		Node newnode = new Node(val);

		newnode.next = null;
		newnode.prev = temp;
		temp.next = newnode;
		return head;
		}

	Node rotateP(Node head, int p){
		int n = 1;
		Node temp = head;
		while (temp.next != null) {
			n++;
			temp = temp.next;
			
		}
		int[] a = new int[p];
		int j=0;
		temp = head;
		while (j != p) {
			a[j] = temp.data;
			temp = temp.next;
			j++;
			
		}
		temp.prev = null;
		head = temp;
		for(int i=0;i<p;i++)
			head = insert(head,a[i]);
		return head;

	}
	
}