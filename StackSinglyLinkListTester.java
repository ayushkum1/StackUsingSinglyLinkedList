package stackwithsinglylinklist;

import java.util.Scanner;

public class StackSinglyLinkListTester {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		boolean exit=false;
		StackSinglyLinkList stack=new StackSinglyLinkList();
		while(!exit) {
			try {
				 System.out.println("\nWelcome to Stack");
				 System.out.println(" 1. Add Element in Stack ");
				 System.out.println(" 2. Remove Element From Stack ");
				 System.out.println(" 3. Display The Stack Element");
				 System.out.println(" 4. Exit");
				 System.out.print(" Enter Your Choice : ");
				 switch(sc.nextInt()) {
				 case 1:
					 System.out.print("Enter a Element : ");
					 stack.push(sc.nextInt());
					 break;
				 case 2 :
					 stack.pop();
					 System.out.print("Stack Elements Are -->  ");
					 stack.display();
					 break;
				 case 3:
					 System.out.print("Stack Elements Are -->  ");
					 stack.display();
					 break;
				 case 4:
					 exit=true;
					 System.exit(0);
					 break;
				default:
					System.out.println("Invalid Option");
					break;
				 }
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
}
