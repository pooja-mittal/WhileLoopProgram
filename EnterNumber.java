import java.util.Scanner;
class EnterNumber
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		int n=1;
		while(n!=0) {
		System.out.println("enter the number");
		 n=scr.nextInt();
		System.out.println(" you entered: " + n);
		}
		System.out.println("try again");
	}
}