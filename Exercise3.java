import java.util.Scanner;
class Exercise3
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		int n=scr.nextInt();
		int sum=0;
		int a=1;
		do {
			sum=sum+a;
			a++;
		} while(a<=n);
		System.out.println("sum: " + sum);
	}
}

