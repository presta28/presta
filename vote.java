import java.util.Scanner;
public class vote {
    public static void votecheck(int age){
        if(age>18)
           System.out.println("he is eligible for vote");
        else
            System.out.println("he is not eligible for voting(chl nikal)");   
        return;    
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();
     votecheck(age);
     return;
    }

    
}
