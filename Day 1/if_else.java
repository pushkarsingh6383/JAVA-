import java.util.*;
public class if_else {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18 && age < 90){
            System.out.println("Eligible to vote");
        }
        else if(age > 90){
            System.out.println("Person was supposed to be Dead!!!");
        }
        else{
            System.out.println("Age Criteria Not Matched");
                }
        
        sc.close();
    }    
}
