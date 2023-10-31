import java.util.Scanner;
public class mark {
	public static void main(String args[])
	{	
		int s1,s2,s3,s4,s5,total,avg;
		char grade;
		Scanner scn=new Scanner(System.in);
	
		System.out.println("Enter 1st Sub mark :");
		s1=scn.nextInt();

		System.out.println("Enter 2nd Sub mark :");
		s2=scn.nextInt();

		System.out.println("Enter 3rd Sub mark :");
		s3=scn.nextInt();

		System.out.println("Enter 4th Sub mark :");
		s4=scn.nextInt();

		System.out.println("Enter 5th Sub mark :");
		s5=scn.nextInt();
		

		total=s1+s2+s3+s4+s5;
		avg=total/5;

		if (avg<40)
		{
			grade='F';
		}
		else if (avg>=40 && avg<55)
		{
			grade='E';
		}
		else if (avg>=55 && avg<65)
		{
			grade='D';
		}
		else if (avg>=65 && avg<75)
		{
			grade='C';
		}
		else if (avg>=75 && avg<85)
		{
			grade='B';
		}
		else if (avg>=85 && avg<95)
		{
			grade='A';
		}
		else
		{
			grade='S';
		}

		System.out.printf("Total=%d\nAverage=%d\nGrade=%c",total,avg,grade);
	}
}