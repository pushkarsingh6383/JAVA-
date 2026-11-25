import java.util.*;
public class subString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        String sent = sc.nextLine();

        System.out.println("select substring");

        System.out.println("starting index");
        int st = sc.nextInt();
        System.out.println("Ending index");
        int end = sc.nextInt();
        
        String sub_String = sent.substring(st,end);
        System.out.println(sub_String);

        sc.close();
    }
    
}
