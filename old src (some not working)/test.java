import java.util.*;

class Linearsearch {
    public static void main(String[] args) {
        int i, n, flag = 0, val, pos = 0;
        int arr[] = new int[10];
        Scanner rc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        n = rc.nextInt();
        System.out.println("Enter array elements");
        for (i = 0; i < n; i++)
            arr[i] = rc.nextInt();
        System.out.println("Enter the value you want to search");
        val = rc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == val) {
                flag++;
                pos = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found a index" + pos);
        } else {
            System.out.println("Element not found");

        }
    }
}
