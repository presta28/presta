import java.util.Scanner;

public class AvgOfNo {
    public static float Avg(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = Avg(a, b, c);
        System.out.println("The average of 3 numbers is " + avg);
    }
}
