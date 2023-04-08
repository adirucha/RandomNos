package methodTest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] randomNumbers = new int[500];//create a list of 500 random numbers
		
		int minNumber= Integer.MAX_VALUE;
		int countloop=0;
		int upperlimit=500;
		 while (countloop<randomNumbers.length-1) {
			 

				Random random= new Random();
				randomNumbers[countloop]=random.nextInt(upperlimit);
				if (randomNumbers[countloop]< minNumber) {
					
					minNumber= randomNumbers[countloop];
					
					
				}countloop ++;
				 System.out.println("Array generated randomly:");
			        System.out.println(Arrays.toString(randomNumbers));
			        System.out.println("The nth minimum number is "+ minNumber);
			       
			        
			 
		 }
		
		
		
		
		
}

}
