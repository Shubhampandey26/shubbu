import java.util.*;

public class main {
    public static int calculate(int a, int b){
        int calculate= a*b;
        return calculate;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a  =sc.nextInt();
        int b= sc.nextInt();
        System.out.println("the product of two numbers is "+calculate(a,b));

    } 
}
