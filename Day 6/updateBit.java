import java.util.*;
public class updateBit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 1;
        int upd = sc.nextInt();

        int bitMask = 1<<pos;

        //For 0
        if(upd == 0){
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }else{
            //For 1
            int newNumber2 = bitMask | n;
            System.out.println(newNumber2);
        }    

        sc.close();
    }
    
}
