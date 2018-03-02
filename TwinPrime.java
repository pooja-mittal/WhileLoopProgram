import java.util.Scanner;
class TwinPrime
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter last number");
		int n=scr.nextInt();
		for(int i=2; i<=n; i++) {
			if((isPrime(i)) && isPrime(i+2))
				System.out.println("( " +  i +  " " + (i+2) + " ) "  );
		}

	}

	public static boolean isPrime(int i)
	{
		int a=1;
		for(int j=2; j<=i/2; j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
		
	}
}




					