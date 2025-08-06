public class febonnaci {
    public static void febo(int n,int a,int b,int i){
      if(i==n-2){
        return;
      }

        int c = a+b;
        System.out.println(c);
        febo(n,b,c,i+1);
    }
    public static void main(String arg[]){
        System.out.println("o");
        System.out.println("1");
        int a = 0;
        int b = 1;
        int n = 6;
        int i = 0;
        febo(n,a,b,i);
    } 
    
}
