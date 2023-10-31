import java.util.Scanner;
public class blood{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=sc.nextInt();
        System.out.print("Enter the weight:");
        int weight=sc.nextInt();
        if(age>=18 && weight>=45){
            System.out.println("You are eligible to donate Blood");
        }
        else{
            System.out.println("You are not eligible to donate Blood");
        }
    }
}
