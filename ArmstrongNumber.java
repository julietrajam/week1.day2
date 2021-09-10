package week1.day1;

public class ArmstrongNumber {

	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	

	public static void main(String[] args) {

		

		// Declare your input
		int input=153;
		// Declare 3 more int variables as result, remainder, original (Tip: Initialize result alone)
		int temp,remainder,result=0;
		// Assign input into variable temp
		temp=input;
		

			// Use loop to calculate: use while loop to set condition until the number greater than 0
            while(temp!=0)
            {

			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
            remainder=temp%10;  
			
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
            result=result+(remainder*remainder*remainder);
			
				
        	// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
            temp=temp/10; 
             
            }
			// Check whether calculated and original are same
            if(result==input)
            {

			//When it matches print it as Armstrong number

            System.out.println("No "+input+" is armstrong");
		
            }
            else
            	System.out.println("Number "+input+" not an Armstrong number");

		
            }
	}


