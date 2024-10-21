package assignment2110;

import java.util.Scanner;

public class SingleLinkedList {
	public static void main(String[] args) {
		int ch,e;
		Scanner sc = new Scanner(System.in);
		SingleLL obj=new SingleLL();
		obj.create_list();
		do {
			System.out.println("1.Insert");
			System.out.println("2.print");
			System.out.println("3.Search");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter element");
				e=sc.nextInt();
				obj.insert_last(e);
				break;
				
			case 2:
				obj.print_list();
				break;
				
			case 3:
				if(obj.root!= null)
				{
					System.out.println("Enter data to search");
					int data=sc.nextInt();
					obj.search_list(data);
				}
				else
					System.out.println("List is empty");
				
			case 0:
				System.out.println("Invalid choice");
				
			}
		}while(ch!=0);
		
		
	}

}
