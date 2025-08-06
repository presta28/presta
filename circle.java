import java.util.Scanner;
public class circle {
    public static float circum(int r){ 
        return (2*3.14f*r);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    System.out.println("the circumference of circle"+circum(r));
    }
}
