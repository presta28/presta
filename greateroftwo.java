import java.util.Scanner;
public class greateroftwo {
    public static int greater(int a,int b){
        if(a!=b)
        {
            if(a>b){
                System.out.println("greater is a");
              return a;
            }
            else{
                System.out.println("the greater is b");
              return b;
            }
        }
        else
        {
        System.out.println("both numbers are same");  
        }
        return a;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greater(a,b);
        System.out.println("the greater from both number is");
    } 
    
}
