import java.util.*;
public class Q8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int originalnum=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(originalnum==rev){
            System.out.println(originalnum+"is a palindrome number");
        }
        else{
            System.out.println(originalnum+"is not a palindrome number");
        }
        sc.close();
    }
}
