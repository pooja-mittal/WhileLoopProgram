import java.util.Scanner;
class BinToDec1
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one binary number");
		int bin=scr.nextInt();
		int rem,i=0;
		double sum=0; 
		while(bin>0) {
			rem=(bin%10);
			sum=sum+(rem*(Math.pow(2,i)));
			bin /=10;
			i++;
		}
		System.out.println(sum);
	}
}