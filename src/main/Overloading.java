package main;

public class Overloading {
	int m1(int i) {
		System.out.println(i);
	return i;
	}
public static void m1(int i,int j) {
	System.out.println(i+j);
	
}
float m1(int i , float j) {
	System.out.println(i+j);
	return i+j;
}
 public static void main(String arg[]) {
	 Overloading obj=new Overloading();
	 obj.m1(10);
	 obj.m1(10,5);
	float x= obj.m1(10 , 20.5f);
	 
 }


}
