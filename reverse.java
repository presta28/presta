public class reverse {
     public static void revdigit(int n,int reve){
        if(n==0){
            System.out.println("reverse of a number "+ reve);
            return;
        }
        int digit = n%10;
        reve = reve*10+digit;
        revdigit(n/10,reve);
    }
        public static void main(String args[]){
            int n = 17534;
            int reve = 0;
            revdigit(n,reve);
        }
    }
    

