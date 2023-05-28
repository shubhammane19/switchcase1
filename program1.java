import java.io.*;

class program1{
	
	public static void main(String []args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int marathiMarks;
		System.out.println("Enter your marathi marks:");
	    marathiMarks = Integer.parseInt(br.readLine());
		
		int englishMarks;
		System.out.println("Enter your english marks:");
	    englishMarks = Integer.parseInt(br.readLine());
		
		int mathsMarks;
		System.out.println("Enter your maths marks:");
	    mathsMarks = Integer.parseInt(br.readLine());
		
		int scienceMarks;
		System.out.println("Enter your science marks:");
	    scienceMarks = Integer.parseInt(br.readLine());
		
		int sanskritMarks;
		System.out.println("Enter your sanskrit marks:");
	    sanskritMarks = Integer.parseInt(br.readLine());
		
		if(marathiMarks<35||englishMarks<35||mathsMarks<35||scienceMarks<35||sanskritMarks<35){
			
			System.out.println("You failed the exams");
		}else{
			
			double avg = (marathiMarks+englishMarks+mathsMarks+scienceMarks+sanskritMarks)/5;
			
			char ch;
			if(avg>75)
				ch ='A';
			else if(avg>60)
				ch = 'B';
			else if(avg>50)
				ch = 'C';
			else if(avg>40)
				ch = 'D';
			else if(avg>=35)
				ch = 'E';
			else
				ch = 'F';
			switch(ch){
			
			case 'A':
						System.out.println("First class with Distinction");
						break;
						
			case 'B':
			
					    System.out.println("First class");
						break;	
						
			case 'C':
			
						System.out.println("Second Class");
						break;
						
			case 'D':
			
						System.out.println("Third class");
						break;
						
			case 'E':
			
						System.out.println("Pass");
						break;
						
			case 'F':
			
						System.out.println("Fail");
						break;
						
			}
		}
	}
}

