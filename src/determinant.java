import java.util.Scanner;

public class determinant {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number for a: ");
        a = sc.nextDouble();
        System.out.println("Enter Number for b: ");
        b = sc.nextDouble();
        System.out.println("Enter Number for c: ");
        c = sc.nextDouble();

        double determinant = b * b - 4 * a * c;
        // if determinant > 0, roots are real and different
        // if determinant == 0, roots are real and equal
        // if determinant < 0, roots are complex complex and different
        if (determinant > 0)
            System.out.println("roots are real and unique");
        else if (determinant == 0)
            System.out.println("roots are real and equal");
        else
            System.out.println("roots are imaginary (no real roots)");

    }
}
