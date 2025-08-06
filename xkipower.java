import java.util.Scanner;
public class xkipower {
    public static void power(int x,int n ,int ans){
        if(n==0){
            System.out.println(ans);
            return;
    }
       ans = ans*x;
       power(x,n-1,ans);
        
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int n = sc.nextInt(); 
            int ans = 1;
            power(x,n,ans);
        }
    }
    

