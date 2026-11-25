import java.util.*;
public class twoD_array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int array_2d[][] = new int[row][column]; 

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                array_2d[i][j] = sc.nextInt();
            }
            // System.out.println();
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(array_2d[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
