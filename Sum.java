import java.util.Scanner;
class Sum
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
			int n=scr.nextInt();
			int a=n;
			int sum=0, mod;
			while(n>0) {
				mod=n%10;
				sum +=mod;
				n=n/10;
		}
	System.out.println("total sum of " + a + " is " + sum);
	}
}

