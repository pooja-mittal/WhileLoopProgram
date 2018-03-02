import java.util.Scanner;
class DecToBin1
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println(" enter one decimal number");
		int n=scr.nextInt();
		int a=n;
		int rem=0;
		String s="";
		while(n>0) {
			rem=n%2;
			s=rem+s;
			n /=2;
		}
		System.out.println("bianry representation of " + a + " is " + s);
	}
}
