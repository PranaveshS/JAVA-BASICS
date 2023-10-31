import java.util.Scanner;

class cardept
{
	public static void main(String[] args)
	{
        int a,b,c;
        String nam;
        Scanner rse=new Scanner(System.in);
    System.out.printf("Enter Your Name \n");
        nam = rse.nextLine();
		System.out.println("Enter the value a, b , c :");
		a = rse.nextInt();
        b = rse.nextInt();
        c = rse.nextInt();

		shape s = new shape();
        cars cr = new cars();
        student st = new student();
        dept d = new dept();
        System.out.println("OUTPUT FOR SHAPES");
		s.rectangle(a,b);
        s.circle(b);
        s.square(a);
        s.triangle(a,b);

        System.out.println("OUTPUT FOR CARS");
        cr.hsc();
        cr.lc();
        cr.mc();
        cr.hc();
    System.out.println("OUTPT FOR STUDENT");
        st.name(nam);
        st.ec();
        st.fees();
        st.ms();
        
        System.out.println("OUTPUT FOR DEPARTMENT");  
        dept.aids();
        dept.cse();
        dept.ece();
        dept.it();
	}
}

class shape 
{
    static void rectangle(int a, int b)
    { 
        System.out.println("---------------------------");
        System.out.println("AREA OF RECTANGLE IS: " + (a*b));
        System.out.println("---------------------------");
    }
    static void square(int x)
    {
        System.out.println("---------------------------");
        System.out.println("AREA OF SQUARE: " + (x*x));
        System.out.println("---------------------------");
    }
    static void triangle(int a, int b)
    {
        double ce = 0.5*a*b;
        System.out.println("---------------------------");
        System.out.println("AREA OF TRINANGLE: "+ ce);
        System.out.println("---------------------------");
    }
    static void circle(int x)
    { 
        double d = 3.14*x*x;
        System.out.println("---------------------------");
        System.out.println("AREA OC CIRCLE: " + d);
        System.out.println("---------------------------");
    }
}
class cars
{
    static void hsc()
    {
        System.out.println("---------------------------");
        System.out.println("1.Jesko \n 2.Chiron \n 3. Honda");
        System.out.println("---------------------------");
    }
    static void  lc()
    {
        System.out.println("---------------------------");
        System.out.println("1.Rolls \n 2.BMW \n 3.Rover");
        System.out.println("---------------------------");
    }
    static void hc()
    {
        System.out.println("---------------------------");
        System.out.println("1.Ferrari \n 2.Lambo \n 3.Bugati");
        System.out.println("---------------------------");
    }
    static void mc()
    {
        System.out.println("---------------------------");
        System.out.println("1.FORD \n 2.Chevrolet \n 3.Saleen");
        System.out.println("---------------------------");
    }
}
class student
{
    
    static void name(String v)
    {
        System.out.println("---------------------------");
        System.out.println("YOUR NAME IS: " + v );
        System.out.println("---------------------------");
    }   
    static void ec()
    {
        System.out.println("---------------------------");
        System.out.println("1. Cricketer \n 2.Dancer \n 3.Artist");
        System.out.println("---------------------------");
    }
    static void fees()
    { 
        int a,b,c;
        double t;
        Scanner re=new Scanner(System.in);
        System.out.println("Enter Tution fees :");
		a=re.nextInt();
        System.out.println("Enter Book fees :");
        b=re.nextInt();
        System.out.println("Enter extras fees :");
        c=re.nextInt();

        t=a+b+c;
        System.out.println("---------------------------");
        System.out.println("Total fees : " + t);
        System.out.println("---------------------------");
    }
    static void  ms()
    {
        
        System.out.println("---------------------------");
        int m1,m2,m3,m4,m5,i,n;
            float total, avg;
            String name;
            Scanner s22=new Scanner(System.in);
            System.out.println("Enter The No.Of Students Mark Sheet Need");
            n=s22.nextInt();
            for(i=1;i<=n;i++)
        {
            Scanner s21=new Scanner(System.in);
            System.out.printf("Student NO %d Enter Your Name \n",i);
            name=s21.nextLine();
            System.out.println("Enter Your First Subject Mark");
            m1=s21.nextInt();
            System.out.println("Enter Your Second Subject Mark");
            m2=s21.nextInt();
            System.out.println("Enter Your Third Subject Mark");
            m3=s21.nextInt();
            System.out.println("Enter Your Fourth Subject Mark");
            m4=s21.nextInt();
            System.out.println("Enter Your fifth Subject Mark");
            m5=s21.nextInt();
            System.out.println("--------- YOUR MARK SHEET IS DISPLAYED BELOW -----------");
            total=m1+m2+m3+m4+m5;
            System.out.println("     -----------------------------------------    ");
            System.out.println("\t|your Total Marks is : " + total + "|");

            avg = total/5;
            System.out.println("\t|your percentile is : " + avg + "|");

            if(avg>=95)
            {
                System.out.println("\t|You secured : 'S' GRADE   |" );

            }

            else if(avg<95 && avg>=90)
            {
                System.out.println("\t|You secured : 'A' GRADE   |");

            }
            else if(avg<90 && avg>=80)
            {
                System.out.println("\t|You secured : 'B' GRADE   |");

            }
            else if(avg<80 && avg>=70)
            {
                System.out.println("\t|You secured : 'C' GRADE   |");

            }
            else if(avg<70 && avg>=60)
            {
                System.out.println("\t|You secured : 'D' GRADE   |");

            }
            else if(avg<60 && avg>=50)
            {
                System.out.println("\t|You secured : 'E' GRADE   |");

            }

            else
            {
                System.out.println("\t|Do Well In Next EXAM   |");
            }
            System.out.println("      ---------------------------------------     ");
            System.out.printf("----- Thank you %s ------\n",name);

        }
        System.out.println("---------------------------");
    }
}
class dept
{
    static void aids()
    {
        System.out.println("---------------------------");
        System.out.println("AI&DS");
        System.out.println("---------------------------");
    }
    static void  cse()
    {
        System.out.println("---------------------------");
        System.out.println("CSE");
        System.out.println("---------------------------");
    }
    static void it()
    {
        System.out.println("---------------------------");
        System.out.println("IT");
        System.out.println("---------------------------");
    }
    static void ece()
    {
        System.out.println("---------------------------");
        System.out.println("ECE");
        System.out.println("---------------------------");
    }
}