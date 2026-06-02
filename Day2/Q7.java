import java.util.*;
public class Q7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1;
        while(n!=0){
            mul=mul*(n%10);
            n=n/10;
           
        } System.out.print(mul);
        sc.close();
    }
}
