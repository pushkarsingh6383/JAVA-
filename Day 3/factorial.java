import java.util.*;
public class factorial{

    public static int fact(int a){
        if(a == 1)return 1;
        if(a == 0)return 1;

        return a*fact(a-1);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int fact = fact(a);
        System.out.print(fact);

        sc.close();
    }
}