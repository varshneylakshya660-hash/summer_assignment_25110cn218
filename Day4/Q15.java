import java.util.Scanner;
public class Q15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int original=n;
        int temp=n;
        int count=0;
        int sum=0;
        while(temp!=0){
          temp=temp/10;
            count++;
        }
        temp=n;
        while(temp!=0){
            int digits=temp%10;
            
            sum=sum+(int)Math.pow(digits,count);
            temp=temp/10;
        }
        if(sum==original){
            System.out.println("armstrong number");
        }else{
            System.out.println("not a armstrong number" );}
        sc.close();
    }
}
