import java.util.Scanner;
class Pentagon
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the last number of the series");
		int n=scr.nextInt();
		int res=1;
		for(int i=1; i<=n; i++) {
			res=(i*((3*i)-1))/2;
			System.out.print(res + " " );
		}
	}
}
