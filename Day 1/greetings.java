import java.util.*;
public class greetings {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==1){
            System.out.println("Hello");
        }
        else if(n==2){
            System.out.println("Bonjour");
        }
        else if(n==3){
            System.out.println("Namaste");
        }
        else{
            System.out.println("Invalid Input!!");
        }

        sc.close();
    }
    
}
