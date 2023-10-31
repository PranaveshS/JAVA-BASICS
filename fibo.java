import java.util.Scanner;

class fibo
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,i=1,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of terms:");
		n=sc.nextInt();
		
		System.out.print(n1+"\t");
		System.out.print(n2+"\t");

		while(i<=n-2)
		{
			n3=n1+n2;
			System.out.print(n3+"\t");
			n1=n2;
			n2=n3;
			i++;
		}
	}
}