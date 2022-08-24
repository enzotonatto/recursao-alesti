public class Somatorio {
     public static void main(String[] args) {
         System.out.println(somatorio(10));
    }
    
    public static int somatorio(int n){
        if(n==1) return 1;
        return n + somatorio(n-1); 
    }
}