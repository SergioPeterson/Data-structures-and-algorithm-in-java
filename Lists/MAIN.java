package Lists;

import java.util.*;
public class MAIN 
{
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");

		LinkedList list = new LinkedList();

		list.insert(2);
		list.insert(5);
		list.insert(7);

		list.deleteAt(2);
		
		list.show();
	}

} 
