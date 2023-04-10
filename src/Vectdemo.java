import java.util.*;

class Vectdemo {
    public static void main(String[] ans) {
        int k, i;
        Vector vec = new Vector();
        k = vec.size();
        System.out.println("the current size of the vector=" + k);

        // Adding Static Elements
        // vec.addElement("one"); // ----adds the object
        // vec.addElement("two");
        // vec.addElement("three");
        // vec.addElement("four");
        // vec.addElement("five");

        // Dynamic Element adding
        // For this to work - run in CMD - java Vectdemo x x x
        // (replace x with random elements according to your choice)

        k = ans.length;
        for (i = 0; i < k; i++)
            vec.addElement(ans[i]);

        System.out.println("The vector is:");
        System.out.println(vec);
        k = vec.size();
        System.out.println("the current size of the vector=" + k);
        vec.removeElement("tuesday");

        vec.insertElementAt("tuesday", 2);
        System.out.println("the vector is=" + vec);
        k = vec.size();
        System.out.println("the current size of the vector =" + k);
        i = 3;
        System.out.println("the element at the given index=" + vec.elementAt(i));

        vec.removeElementAt(3);

        k = vec.size();
        System.out.println("the current size of the vector =" + k);

    }
}