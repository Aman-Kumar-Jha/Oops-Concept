package Polymorphism;

public class OverloadingTest {
static int add(int a, int b) {return a+b;}
static int add(int a , int b, int c) {return a+b+c;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingTest a=new OverloadingTest();
		System.out.println(a.add(10,20));
		System.out.println(a.add(30,40,50));
	}

}
