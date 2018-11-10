
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Iterator;



class MailSystem {
    
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		for (int testCase = 0; testCase < numTestCases; testCase++) {
		    int n = sc.nextInt();
		    int q = sc.nextInt();
		    LinkedList<Integer> unread = new LinkedList<Integer>();
		    LinkedList<Integer> read = new LinkedList<Integer>();
    	    LinkedList<Integer> trash = new LinkedList<Integer>();
    	    
		    // Initially list of n elements is all unread.
		    
		    for (int j = 1; j <= n; j++) {
		        unread.addLast(j);
		    }
		    for (int i = 0; i < q; i++) {
		        int action = sc.nextInt();
		        int id = sc.nextInt();
		        switch (action) {
		            case 1:
		                move(unread, read, id);
		                break;
		            case 2:
		                move(read, trash, id);
		                break;
		            case 3:
		                move(unread, trash, id);
		                break;
		            case 4:
		                move(trash, read, id);
		                break;
		        }
		    }
		    // Print output lists
		    printList(unread);
		    printList(read);
		    printList(trash);
		}
	}
	public static void move(LinkedList from, LinkedList to, int id) {
	    int mailItem = from.indexOf(id);
	    if (mailItem == -1) {
	        System.out.println("ID = " + id + " missing");
	        printList(from);
	    }
	    from.remove(mailItem);
	    to.addLast(id);
	}
	
	public static void printList(LinkedList list) {
	    if (list.isEmpty()) {
	        System.out.println("EMPTY");
	    } else {
	        Iterator it = list.iterator();
		    while (it.hasNext()) {
    		    System.out.print(it.next() + " ");
		    }
		    System.out.println();
	    }
	}
}