import java.util.Scanner;
public class Q12 {
    
    public static int gcd(int x,int y){
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }return x;
    }    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=sc.nextInt();
        System.out.println("Enter second number:");
        int y=sc.nextInt();
        int lcm=(x*y)/gcd(x,y);
        System.out.println("LCM "+ lcm);
        sc.close();
    }
}
