package Polymorphism;
class Adder{
	double add(int a,long b,float c, double d) {
		return a+b+c+d;
	}
	double add(double a, double b)
	{
		return a+b;
	}
}
public class MethodOverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Adder a = new Adder();
System.out.println(a.add(20,20));
System.out.println(a.add(20,20,20,20.20));
	}

}
