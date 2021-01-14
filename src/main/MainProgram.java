package main;

import array.ReverseArray;

public class MainProgram {
	public static void main(String arg[]) {
		int arr[] = { 2, 5, 2, 80, 6, 7, 6 };
		ReverseArray reverseArray=new ReverseArray();
		reverseArray.reverseArray(arr,0, arr.length-1);
	}

}
