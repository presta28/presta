import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
public class countnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int p = 0;
        int ne = 0;
        int z = 0;
        for(int i = 1; i<=n; i++){
            int num = sc.nextInt();
           if(num>0){
            p = p+1;   
        }   else if(num<0){
            ne=ne+1;
        } else
            z=z+1;
        }
    System.out.println("positive"+p);
    System.out.println("negative"+ne);
    System.out.println("zeros"+z);
return; 
}
}
