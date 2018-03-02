import java.util.Scanner;
class InfiniteSeries
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scr.nextInt();
		System.out.println("enter the last range");
		int n=scr.nextInt();
		infinite(num,n);
	} 

	public static double infinite(int num, int n) {
		double sum=0,mul=1.0;
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println("i = " + i);
				double res=(i-1)/i;
				System.out.println("resule = " + res);
				mul=mul*res;
				System.out.println("multiply = " + mul);
				sum=sum+mul;
				//System.out.println("even sum " + sum);
			} else {
				sum=sum+(Math.pow(num,i))/(i);
				//System.out.println("odd sum " + sum);
			}
			
		}
		//System.out.println("sum " + sum);
		return sum;
	}
}

