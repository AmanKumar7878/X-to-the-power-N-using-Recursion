import java.util.Scanner;

public class XToThePowerN {
    public static int pow(int x,int n) {
        if (n == 0)
            return 1;
        else
            return x*pow(x,n-1);
    }

    public static void main(String[] args) {
        int n,x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt();
        System.out.println(pow(x,n));
    }
}
