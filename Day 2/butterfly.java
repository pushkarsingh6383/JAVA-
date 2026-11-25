public class butterfly {
    public static void main(String[] args) {
      // System.out.println("Hello, World!");

      int k = 4;
      int n = 6;
      int m = 1;

      for(int i = 1; i <= k; i++){
        for(int j = 1; j <= m; j++){
          System.out.print("*");
        }
        for(int j = 1; j <= n; j++){
          System.out.print(" ");
        }
        n = n-2;
        for(int j = 1; j <= m; j++){
          System.out.print("*");
        }
        m++;
      System.out.println();
      }

      int l = 4;
      int p = 0;

      for(int i = 1; i <= k; i++){
        for(int j = l; j >= 1; j--){
          System.out.print("*");
        }
        for(int j = 1; j <= p; j++){
          System.out.print(" ");
        }
        p = p + 2;
        for(int j = l; j >= 1; j--){
          System.out.print("*");
        }
        l--;
      System.out.println();
      }

    }
}
