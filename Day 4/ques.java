import java.util.*;
public class ques {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of column");
        int col = sc.nextInt();
        int array[][] = new int[row][col];
        
        System.out.println("Enter array");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter target element");
        int tar = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(array[i][j] == tar){
                    System.out.println("indexes are " +i+","+j);
                }
            }
        }
    }
}
