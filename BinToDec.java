import java.util.Scanner;
class BinToDec
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter binary number");
		int  n=scr.nextInt();
		int rem;
			int i=0;
		double sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*(Math.pow(2,i)));
			i++;
			n=n/10;
		}
		System.out.println("decimal is: " + sum);
	}
}

