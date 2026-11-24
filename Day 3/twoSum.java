import java.util.*;
public class twoSum {
    public static int calculateSum(int a, int b){
        return a+b;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.print("Sum of two numbers is " + sum);
        sc.close();
    }
    
}
