import java.util.*;

    public class Q9 {
        public static void main(String[]args){
            Scanner sc=new Scanner (System.in);
            int n=sc.nextInt();
           boolean isPrime=true;
            int i=2;
            if(n<=1){
            isPrime=false;
            }
            else{
                while(i<n){
                    if(n%i==0){
                        isPrime=false;
                        break;
                    }i++;
                }
            }

            if(isPrime){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }sc.close();
        }
    }

