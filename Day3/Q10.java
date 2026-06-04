import java.util.Scanner;
public class Q10 {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;
        }
        public static void main(String[]args){
            Scanner sc =new Scanner(System.in);
            System.out.println("enter start of range:");
            int start=sc.nextInt();
            System.out.println("enter end of range:");
            int end=sc.nextInt();
            System.out.println("prime numbers between"+ start +"and"+ end +"is:");
            for(int i=start;i<=end;i++){
                if(isPrime(i)){
                    System.out.print(i+ " ");
                }sc.close();
            }
        }
}
