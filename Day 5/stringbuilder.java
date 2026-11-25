import java.util.*;
public class stringbuilder {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //insert
        sb.insert(4," Stark");
        System.out.println(sb);

        //char at 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //delete
        sb.delete(4, 10);
        System.out.println(sb);

    }
    
}
