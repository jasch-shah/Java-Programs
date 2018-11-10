import java.util.*;
import java.io.*;

class DeleteLinkedList
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d){ data=d; next=null;}
	}

	

	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}

	public int getCount()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		DeleteLinkedList dl=new DeleteLinkedList();

		dl.push(1);
		dl.push(4);
		dl.push(1);
		dl.push(12);
		dl.push(1);

		System.out.println("Count of nodes is "+dl.getCount());
	}
}