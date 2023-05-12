import java.util.*;

class table {

    public static void main(String[] fqw) {
        int r, i, n, x, m;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the table number which you want:");
        r = sc.nextInt();

        System.out.print("Enter the the nth number of the table :");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            x = r * i;
            System.out.println(r + "x" + i + "=" + x);
        }
    }
}