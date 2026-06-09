import java.util.Scanner;
public class Q18 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        
        int original=n;
        int sum=0;
        while(n!=0){
          int num =n%10;
           int fact=1;
            for(int i=1;i<=num;i++){
                fact*=i;
            }sum+=fact;
           n=n/10;
        }if(sum==original){
            System.out.println("the given number is a strong number");
        }else{
            System.out.println("the given number is not a stromg number");
        }sc.close();
    }
}
