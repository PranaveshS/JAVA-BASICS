import java.util.Scanner;
public class leap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("It is a LeapYear");
        }
        else
        {
            System.out.println("It is not a LeapYear");
        }
    }
}
