import java.util.Scanner;
class FibnnociNumber
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		int num=scr.nextInt();
		int a=0, b=1,m=1,c=0;
		for(int i=1; i<=num; i++) {		
			c=a+b;
			a=b;
			b=c;
			if(c==num) {
			m=0;
			System.out.println("number is in fibnnoci series");
				break;
			}
		}
		
		if(m==1) {
			System.out.println("number is not in fibnnoci series");
		}
	}
}




