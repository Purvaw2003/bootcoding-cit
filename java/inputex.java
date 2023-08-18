import java.util.Scanner;

public class inputex {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number:");
            int n = sc.nextInt();
            System.out.println("Enter Second Number:");
            int m = sc.nextInt();


            int add = n + m;
            System.out.println("Addition =" + add);

            int substraction = n - m;
            System.out.println("Substraction =" + substraction);

            int multiplication = n * m;
            System.out.println("multiplication =" + multiplication);

            int division = n / m;
            System.out.println("division =" + division);

            int mod = n % m;
            System.out.println("modulus =" + mod);


    }
}
