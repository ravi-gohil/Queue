import java.util.Scanner;

public class QueueDemo {

	public static void main(String args[]){
		Scanner sn =new Scanner(System.in);
		
		System.out.println("Enter the size of Queue:");
		int number = sn.nextInt();
		
		QueueExample q=new QueueExample(number);
		char ch = 0;
		do{
			
			System.out.println("Queue operations:");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Peek");
			System.out.println("4. Check Empty ");
			System.out.println("5. Check full");
			System.out.println("6. Size");
			
			int choice = sn.nextInt();
			switch(choice)
			{
			
				case 1:
					System.out.println("Enter the number");
					int num = sn.nextInt();
					try
					{
						q.insert(num);
					}
					catch(Exception e)
					{
						System.out.println("Error :"+e.getMessage());
					}
					break;
				
				case 2:
					
					try
					{
						System.out.println("removed Element : " +q.delete());
					}
					catch(Exception e)
					{
						System.out.println("Error :"+e.getMessage());
					}
					break;
				
				case 3:
					
					try
					{
						System.out.println("Peek Element :" +q.peek());
					}
					catch(Exception e)
					{
						System.out.println("Error :"+e.getMessage());
					}
					break;

				case 4:
					
						System.out.println("Empty Status :"+q.isEmpty());
						break;

				case 5:
					System.out.println("Full Status"+q.isFull());
					break;

				case 6:
					System.out.println("Current Size of Queue :"+q.getSize());
					break;
				default:
					System.out.println("wrong Input");

			}
			q.display();
			System.out.println("Do you want to continue (y|n)");
			ch = sn.next().charAt(0);
		}while(ch == 'Y'||ch == 'y');
		sn.close();
	}
}
