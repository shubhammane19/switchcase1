import java.io.*;

class program5{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		System.out.println("Welcome to bajaj bike stop:");
		System.out.println("Enter the bike you want to buy:");
		System.out.println("1.Fully Faired");
		System.out.println("2.Naked bikes");
		System.out.println("Enter your choice 1 or 2:");
		choice = Integer.parseInt(br.readLine());
		switch(choice){
			
			case 1:{
				
				int ch;
				System.out.println("Fully Faired options are:");
				System.out.println("1. Bajaj pulsar 220F");
				System.out.println("2. Bajaj pulsar rs200");
				System.out.println("3. Bajaj pulsar F 250");
				ch = Integer.parseInt(br.readLine());
				switch(ch){
					
					case 1:
						System.out.println("You have selected bajaj pulsar 220F");
						break;
						
					case 2:
						System.out.println("You have selected bajaj pulsar rs200");
						break;
						
					case 3:
						System.out.println("You have selected bajaj pulsar F 250");
						break;
						
					default:
						System.out.println("Invalid option");
				}
			}
			break;
			
			case 2:{
				
				int ch;
				System.out.println("Naked bikes options are:");
				System.out.println("1. Bajaj pulsar ns125");
				System.out.println("2. Bajaj pulsar ns200");
				System.out.println("3. Bajaj pulsar ns 160");
				ch = Integer.parseInt(br.readLine());
				switch(ch){
					
					case 1:
						System.out.println("You have selected bajaj pulsar ns125");
						break;
						
					case 2:
						System.out.println("You have selected bajaj pulsar ns200");
						break;
						
					case 3:
						System.out.println("You have selected bajaj pulsar ns 160");
						break;
						
					default:
						System.out.println("Invalid option");
				}
			}
			break;
			default:
			System.out.println("Invalid choice");
		}
	}
}