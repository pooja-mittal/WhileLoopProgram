import java.util.Scanner;
class Exercise1
{
	public static void main(String[] args)
	{
		int n;
		Scanner scr=new Scanner(System.in);
		while(true) {
		System.out.println("enter an integer");
		n=scr.nextInt();
		if(n==0) {
			break;
		}
		System.out.println("you eneterd " + n);
		}
		System.out.println("try again");
	}
}