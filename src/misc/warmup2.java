package misc;

import java.util.Scanner;

public class warmup2 {

	class class1{
		public static void main(String fdsafds[]) {

		}
	}
	
	class class2{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = new String("dfsafdsa");
		Scanner input = new Scanner(System.in);
 
 /*String word= input.nextLine();
 
 for(int i= word.length()-1;i>=0;i--) {

	 System.out.print( word.charAt(i));
 }*/
	System.out.println("Enter your number 1:");
 int a=input.nextInt();
 System.out.println("Enter your number 2:");
 int b=input.nextInt();
  if( a == b)
  {
	  System.out.println("sum:"+(a+b));
  }
  else 
	  System.out.println("output2:"+(a+b)*2);
}
}