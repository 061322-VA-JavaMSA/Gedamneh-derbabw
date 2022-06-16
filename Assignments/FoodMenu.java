package Revature;
import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
	
		Scanner Sc = new Scanner(System.in);
		
		int  choice;
		
		
	    System.out.println("Please Enter Your name");
	
	    String name=Sc.nextLine();
		
	
		
		System.out.println("Hello  "+name+ "\nWelcome to our Restaurant! Please select Your Choice:\n" + "1) steak\n"
                + "2) Piza\n"
                + "3) salad\n"
                + "and any other number for nothing!");
		
  choice =Sc.nextInt();
  
  switch (choice) {
  case 1:
      System.out.println( "Here is your steak!");
      break;
  case 2:
      System.out.println("Here is your Piza!");
      break;
  case 3:
      System.out.println( "Here is your salad!");
      break;
  default:
      System.out.println("You want nothing?!");
      break;
      
      
      
}
  
  int option;
  Scanner sd = new Scanner(System.in);
System.out.println("\nPlease select a drink:\n"
         + "1) iced tea\n"
            + "2) soda\n"
            + "3) lemonade\n"
            + "and any other number for nothing!" );
 option =  sd.nextInt();
switch (option) {
 case 1:
     System.out.println( "Here is your iced tea!");
     break;
 case 2:
     System.out.println("Here is your soda!");
     break;
 case 3:
     System.out.println("Here is your lemonade!");
     break;
 default:
     System.out.println("You want nothing?!");
     break;
  
  
	}

}
}
