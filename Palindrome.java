package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare the variable as int =454;
		int input=454,reverse=0;
		
		//Hold the number in a temporary variable.
		int temp=input;
		
		//Reverse that number
		while(temp != 0)   
		{  
		int remainder = temp % 10;  
		reverse = reverse * 10 + remainder;  
		temp = temp/10;  
		}  
		
		if(input==reverse)
			System.out.println("Number "+input+" is a Palindrome");
		else
			System.out.println("Number "+input+" is not a Palindrome");
		
		

	}

}
