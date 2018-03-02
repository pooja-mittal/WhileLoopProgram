import java.util.Scanner;
class Exercise2
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a= scr.nextInt();
		int b=scr.nextInt();
		int temp;
		temp=b;
		b=a;
		a=temp;
		System.out.println("interchange number are  " + a + " and " + b);
	}
}
