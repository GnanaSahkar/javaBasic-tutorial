
import java.util.*;
public class fact {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int b = sc.nextInt();
    int a = sc.nextInt();
    System.out.println(factorial(d));
    System.out.println(factorial(b));
    System.out.println(factorial(a));
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}

