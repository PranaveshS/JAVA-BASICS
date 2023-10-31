/* import java.util.Scanner;
public class method {
    public static Scanner sc=new Scanner(System.in);
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.print("Enter the numbers: ");
        method x = new method();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("O/P: "+x.add(a,b));
    }
} */
import java.util.Scanner;
public class method{
    public static Scanner sc=new Scanner(System.in);
    public String name(String x,String y){
        return x+y;
    }
    public static void main(String[] args){
        System.out.print("Enter the string: ");
        method a=new method();
        String x=sc.nextLine();
        String y=sc.nextLine();
        System.out.print("O/P: "+a.name(x,y));
    }
}
