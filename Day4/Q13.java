import java.util.Scanner;
public class Q13{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=1;
    int n=sc.nextInt();
   for(int i=1;i<=n;i++){
    System.out.print(a+" ");
    int temp=a+b;
    a=b;
    b=temp;
   }sc.close();
}
}