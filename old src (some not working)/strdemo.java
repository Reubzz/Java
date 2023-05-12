import java.util.*;

class strdemo {
    public static void main(String[] args) {

        int k, i, n;
        String w1 = new String("life is short");
        String w2 = new String("forgetting is long");

        k = w1.length();
        System.out.println("The lengtrh of " + w1 + "=" + k);

        k = w2.length();
        System.out.println("The length of " + w2 + "=" + k);

        k = w1.compareTo(w2);
        System.out.println("compare the two words:" + k);

        System.out.println("Arethey equal?" + w1.equals(w2));

        System.out.println("Arethey equal?" + w1.equalsIgnoreCase(w2));

        System.out.println("Combined word:" + w1.concat(w2));

        n = w2.length();
        for (i = 0; i < n; i++) {
            System.out.println(w2.charAt(i));
        }
    }
}