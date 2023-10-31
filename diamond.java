import java.util.Scanner;

public class diamond {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.print("Enter the range:");
        int n= sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<(n-i)+1;j++){
                    System.out.print("  ");
                }
                for(int j=0;j<2*i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=n;i>=0;i--){
                for(int j=0;j<(n-i) +1;j++){
                    System.out.print("  ");
                }
                for(int j=0;j<2*i +1;j++){
                    
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
