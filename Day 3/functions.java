import java.util.*;
class functions{

    public static void func(String name){
        System.out.print("hello " + name);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        func(name);
        sc.close();

    }
}