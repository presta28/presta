//public java.util.Scanner;
public class palindrome {
    public static void palind(String str,int idx){
        if (idx==str.length()-1){
            System.out.println("palindrome");
            return;
        }
        if(str.charAt(str.length()-1-idx)!=str.charAt(idx)){
          System.out.println("not palindrome");
            return;
        }
            palind(str, idx+1);
        
    }
    public static void main(String args[]){                            
     //  Scanner sc = new Scanner (System.in);
       // String str = sc.next();
       String str = "deed";
       int idx=0;
        palind(str, idx);
    }
    
}
