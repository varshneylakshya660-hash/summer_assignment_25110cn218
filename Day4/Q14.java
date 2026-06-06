import java.util.Scanner;
public class Q14{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=1;
    int n=sc.nextInt();
    int i=1;
   while(i<=n){
    if(i==n){
        System.out.println(a);
    }
    i++;
    int temp=a+b;
    a=b;
    b=temp;
   sc.close();
}
}}
