import java.util.*;
public class bubbleSort{
    public static void main(String[] arf){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        System.out.print("enter array: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        //bubble sort
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("sorted array");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        sc.close();
     }
}