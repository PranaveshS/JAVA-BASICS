import java.util.Scanner;
public class fact
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    int b=1,i;
    for(i=1;i<=n;i++)
	{
	    b*=i;
    }
	System.out.println(b);
    }
}	