import java.util.Scanner;
class DecToHexadecimal
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one decimal number");
		int dec=scr.nextInt();
		String hexa="";
		int rem,a;
		while(dec>0) {
			rem=dec%16; 			
			hexa=rem+hexa;
			dec /=16; 			
		}
		System.out.println(hexa);
	}
}

