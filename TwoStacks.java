import java.util.*;

class TwoStacks{
	int size;
	int top1,top2;
	int arr[];
	
	TwoStacks(int n)
	{
		arr = new int[n];
        size = n;
		top1 = n/2+1;
		top2 = n/2;
	}
	
	
	void push1(int x)
	{
		if(top1>0)
		{
			top1--;
			arr[top1] = x;
		}
		else
		{
			System.out.println("Stack full");
			return;
			
		}
	}
	
	void push2(int x)
	{
		if(top2 < size-1)
		{
			top2++;
			arr[top2] = x;
		}
		else
		{
			System.out.println("Stack full");
			return;
			
		}
	}
	
	int pop1()
	{
		if(top1 <=size /2)
		{
			int x = arr[top1];
			top1++;
			return x;
		}
		else
		{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 0;
	}
	
	
	 int pop2()
	{
		if(top2 >= size/2 +1)
		{
			int x = arr[top2];
			top2--;
			return x;}
		}
		else
		{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 1;
	}
	
	
	public static void main(String[] args)
	{
		TwoStacks a = new TwoStacks(5);
		
		a.push1(5);
		a.push2(10);
		a.push2(15);
		a.push1(11);
		a.push2(7);
		
		
		System.out.println("Poped Element from stack1 is :" + a.pop1() );
		
		a.push2(40);
		System.out.println("Poped Element from stack2 is :" +  a.pop2());

		
		
	}
	

}