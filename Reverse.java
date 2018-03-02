import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		int n=scr.nextInt();
		int a=n;
		int m=0; 
		while(n>0) {
			m=(m*10)+(n%10);
			n /= 10;
		}
		System.out.println("reverse of a number: " + m);
		System.out.println();
		if(a==m) 
			System.out.println(a+ " this number is palindrone");
			else  System.out.println( a + " this is not palindrone");
	}
}