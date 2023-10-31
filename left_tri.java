import java.util.Scanner;
public class left_tri
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int i,j;

        System.out.print("Enter the range:");
        int n = sc.nextInt();

        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
    }
}