import java.util.*;

public class Sort{
	//Taking array from user
	public static int[] getArray()
	{
		int[] array1;
        Scanner sc = new Scanner(System.in)	;
		System.out.println("Number of Element in array");
		
	      array1 = new int[sc.nextInt()];
		  
		 System.out.println("Elements in array");
		  
		  for
		  (int i=0;  (sc.hasNextInt() && (i < array1.length)); i++)
		  { array1[i] = sc.nextInt();}
		  
		 // System.out.println("Enter element you want to comapre");

          return array1;	
        		  
 		 
	}
	
	//Display function
	public static void displayArr(int[] array)
	{
		for (int i : array)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println(" ");
	}
	
	
    public static void main(String[] args)
	{
		int[] array = getArray();
        int temp;
		
		
        
		  
         for (int i = array.length-1; i>0 ; i--)
		 {
			
			 temp = array[i];
			 
			 if(array[i-1]>temp)
			 {
				 array[i]=array[i-1];
				 displayArr(array);
				 array[i-1] = temp;
			 }
		 }	

        displayArr(array);		 
	}
}