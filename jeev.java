import java.util.Scanner;
public class jeev{
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       int d = a.nextInt();
       int f = a.nextInt();
       int e = a.nextInt();
       int result  = sum(d,e);
       int resultb = sum(e,f);
       System.out.println(result);
       System.out.println(resultb);
    }
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;   
    }
}