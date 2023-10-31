import java.util.Scanner;
public class equ_tri {
	public static void main(String args[])
	{
		int n,i,j=0,sp;
		Scanner scn=new Scanner(System.in);

		System.out.print("Enter the range:");
		n=scn.nextInt();
	
		for (i=1;i<=n;i++)
		{
			j=0;
			for (sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			while (j!=2*i-1)
			{
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
		}
	}
}