public class caldigit {
    public static void calcdigit(int n,int ans){
        if(n==0){
            System.out.println("No of digit is "+ans);
            return;
        }
        ans = ans + 1;
        calcdigit(n/10,ans);
    }
        public static void main(String args[]){
            int n = 123666884;
            int ans = 0;
            calcdigit(n,ans);
        }
    }
    
