import java.util.Scanner;
class BinToOctel
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one binary number");
		int bin=scr.nextInt();
		int rem,i=0;
		double sum=0;
		while(bin>0) {
			rem=bin%10;
			sum=sum+(rem*(Math.pow(2,i)));
			i++;
			bin=bin/10;
		} System.out.println("decimal number " + sum);
		System.out.println("sum  " + sum);
		long dec=sum;
		String octel="";
		while(dec>0) {
			
			octel=(dec%8)+octel;
			dec =dec/8;			
		
		}
		System.out.println(octel);
	}
}
			



