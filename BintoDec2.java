import java.util.Scanner;
class BinToDec2
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one binary number");
		long n=scr.nextLong();
		long a=n;
		int i=0;
		double rem=1,sum=0;
		while(n>0) {
			rem=n%10;
			sum += rem*(Math.pow(2,i));
			n=n/10;
			i++;
		}
		System.out.println("decimal of " + a + " is " + sum);
	}
}