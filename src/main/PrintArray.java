package main;

public class PrintArray {
	public static void main (String args[]) {
		
		int array[]= {2,5,8,9,7,3};
		int small=array[0];
		
		for(int i=1;i<array.length;i++) {
			
			if(array[i]<small) {
				small=array[i];
			}
		}
		System.out.println("small element is : "+small);
	}

}
