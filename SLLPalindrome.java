import java.io.*;
import java.util.*;

class SLLPalindrome
{
	Node head;
	Node slow_ptr,fast_ptr,second_half;

	class Node
	{
		char data;
		Node next;

		Node(char d)
		{
			data=d;
			next=null;
		}
	}

	boolean isPalindrome(Node head)
	{
		slow_ptr=head;
		fast_ptr=head;
		Node prev_of_slow_ptr=head;
		Node midnode=null;
		boolean res=true;

		if(head!=null && head.next!=null)
		{
			while(fast_ptr != null && fast_ptr.next != null)
			{
				fast_ptr=fast_ptr.next.next;

				prev_of_slow_ptr=slow_ptr;
				slow_ptr=slow_ptr.next;
			}

			if(fast_ptr != null)
			{
				midnode=slow_ptr;
				slow_ptr=slow_ptr.next;
			}

			second_half=slow_ptr;
			prev_of_slow_ptr=null;
			reverse();
			res=compareList(head,second_half);

			reverse();
			if(midnode != null)
			{
				prev_of_slow_ptr.next=midnode;
				midnode.next=second_half;

			}else
			{
				prev_of_slow_ptr.next=second_half;
			}
		}

		return res;

	}

	void reverse()
	{
		Node prev=null;
		Node current=second_half;
		Node next;
		while(current != null)
		{
			next = current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
	}
}