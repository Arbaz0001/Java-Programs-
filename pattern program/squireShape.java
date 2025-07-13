public class squireShape {
    public static void main(String[] args) {
        int n=9; 
        // int center= n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1||j==n||i==1||i==n||j==n/2+1||i==n/2+1||i+j==n+1||i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  " );
                }
            }
            System.out.println();
        }
    }
}
