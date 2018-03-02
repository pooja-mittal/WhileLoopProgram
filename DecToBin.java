import java.util.Scanner;
class DecToBin
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one binary number");
		int dec=scr.nextInt();
		String binary="";
		while(dec!=0)
		{
			binary=(dec%2)+binary;
			dec /=2;
			System.out.println("decimal no is: " + binary);
		}
		
	}
}

