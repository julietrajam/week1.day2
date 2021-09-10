package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		int arrayIndex=0;
		//Sort the array
		//Arrays.sort(arr);
		
		
		//loop through the array (start i from arr[0] till the length of the array)
		for(int i=1;i<arr.length;i++) {

					// check if the iterator variable is not equal to the array values respectively
				if(i!=arr[i-1])
					{
						// print the number
						System.out.println("Number:"+i);
						break;
					}
					
				
		} 
		
		/* for(int i=0;i<arr.length-1;i++)
        {
			
            if(arr[i]+1!=arr[i+1])
            {
                System.out.println(arr[i]+1);
                break;
            }
        } */
	}

}
