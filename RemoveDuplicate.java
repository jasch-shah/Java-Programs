/**
 * Write code to remove duplicates from an unsorted linked list.
 *
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
import java.util.*;
//import static helpers.Printer.*;

public class RemoveDuplicate {
	static void removeDuplicates(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode prev  = null;
		while(n != null){
			if(set.contains(n.data)){
				prev.next = n.next;
			}
			else {
				set.add(n.data);
				prev = n;
			}
			n = n.next;
		}
	}
	static void removeDuplicates2(LinkedListNode n){
		while(n != null){
			LinkedListNode runner = n;
			while(runner.next != null){
				if(runner.next.data == n.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			n = n.next;
		}
	}

	// Test
	public static void main(String[] args) {
		int[] list = {1,1,2,3,3,4,2,5,5};
		LinkedListNode n = LinkedListNode.buildList(list);
		removeDuplicates(n);
		LinkedListNode.printList(n);
		n = LinkedListNode.buildList(list);
		removeDuplicates2(n);
		LinkedListNode.printList(n);
	}
}