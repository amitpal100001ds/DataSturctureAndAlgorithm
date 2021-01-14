package main;

public class PlainDrom {

	
	public static void main(String args[]) {
		int number=121;
		int sum=0;
		int temp=number;
		while(number!=0) {
			int rem=number%10;
			number=number/10;
			 sum=sum*10+rem;
		}
		if(temp==sum) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("Number is not palindrom");
		}
		
		
	}
}
