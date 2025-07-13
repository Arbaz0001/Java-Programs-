public class damru {

        public static void main(String[] args) {
            int n=7, sp=0, st=n;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=sp; j++){
                    System.out.print(" ");
                }
                for(int j=1 ; j<=st ; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
    
                if(i<=n/2){
                    sp++;
                    st-=2;
                }
                else{
                    sp--;
                    st+=2;
                }
            }
        }
    
    
}
