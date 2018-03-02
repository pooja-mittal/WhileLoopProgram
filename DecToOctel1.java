import java.util.Scanner;
class DecToOctel1
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one decimal number");
		int n=scr.nextInt();
		String s="";
		int rem;
		while(n>0) {
			rem=n%8;
			s=rem+s;
			n /=8;
		} System.out.println(s);
	}
}
