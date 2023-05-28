import java.io.*;

class program3{
		
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2;
		
		System.out.println("Enter first number:");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter second number:");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.println("multiplication : " +num1*num2);
		
		if(num1<0||num2<0){
			
			System.out.println("Negative Numbers not allowed");
		}else{
			
			switch((num1*num2)%2){
				
				case 0:
					System.out.println("the multiplication is even");
					break;
					
				case 1:
					System.out.println("The multiplication is odd");
					break;
			}
		}
	}
	
}