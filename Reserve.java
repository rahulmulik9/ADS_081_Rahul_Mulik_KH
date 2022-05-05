import java.util.LinkedList;
import java.util.Scanner;

class Node
{
	int data;
	Node next;
	
	Node(int data , Node next)
	{
		this.data = data;
		this.next = null;
	}
}


public class Reserve
{
	  public static Node revrs(Node head)
     {
     	Node previous = null;
     	Node current = head;
		Node next = null;
     	
     	while(current != null)
     	{
			next = current.next;
     	   current.next = previous;
     		
			
			previous = current;
			current = next;
     	}
		head=previous;
     	return previous;
     }

     public static void displayList(Node head)
     {
     	Node ptr = head;
     	
     	while(ptr != null)
     	{
     		System.out.print(ptr.data + " ");
     		ptr = ptr.next;
     	}
     }
	
	public static void main(String[] args)
	{
		
		//tske linked list data from user
		//pointer traversal to end
		LinkedList list = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Emter no of nodes");
		int size = sc.nextInt();
		
		System.out.print("Enter number of linkedlist");
		int a[] = new int[size];
		
		for(int i =0 ; i<size ; i++)
		{
			a[i]= sc.nextInt();
		}
		
		Node head = null;
		for(int i =size-1; i>0 ; i--)
		{
			head = new Node(a[i] , head);
		}
		
		head = revrs(head);
		displayList(head);
	}
}