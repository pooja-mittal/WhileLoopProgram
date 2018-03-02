import java.util.Scanner;
class DecToOctel
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one decimal number");
		int dec=scr.nextInt();
		String octel="";
		while(dec>0) {
			octel=(dec%8)+octel;
			dec=dec/8;
			System.out.println(octel);
		}
	}
}
	