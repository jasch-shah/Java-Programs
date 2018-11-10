import java.util.*;
import java.io.*;
import java.lang.*;

class NonRepeatingStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Node head = new Node();
			String repeat = "";
			head.data = "-1";
			for(int i = 0;i<n;i++){
				String k = sc.next();
				Node temp = head;
				Boolean found = false;
				while(temp.next != null){
					if((temp.next.data).equals(k)){
						temp.next = temp.next.next;
						found = true;
						repeat += k;
					} else {
						temp = temp.next;
					}
				}
				if(!found && repeat.indexOf(k) == -1){
					Node latest = new Node();
					latest.data = k;
					temp.next = latest;
				}
				if(head.next != null){
					System.out.print(head.next.data+" ");
				}else{
					System.out.print(head.data+" ");
				}
			}
			System.out.println();
			t--;
		}
	}
}

class Node{
	String data;
	Node next;
	public Node(){

	}
}