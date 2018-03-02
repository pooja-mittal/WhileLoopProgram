import java.util.Scanner;
class PrintSum
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scr.nextInt();
		int a=1,sum=0;
		while(a<=n) {
			sum =sum+a;
			a++;
		}
		System.out.println("final sum: " + sum);
	}
}

