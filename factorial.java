public class factorial {
    public static void factor(int n,int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact=fact*n;
        factor(n-1,fact);
    } 
    public static void main(String args[]){
        int n=3;
        int fact = 1;
        factor(n,fact);
    }
    
}
