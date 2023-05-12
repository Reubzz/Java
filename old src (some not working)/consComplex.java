import java.util.*;

class consComplex // -------design part
{
  Scanner sc = new Scanner(System.in);
  int real, img; // -----initialization

  consComplex() {
    System.out.println("Constructor created");
  }

  consComplex(int x, int y) {
    real = x;
    img = y;
  }

  void showNum() {
    System.out.println("The complex no = " + real + " + " + img + "i");
  }

  consComplex add(consComplex n) // ---function for addition
  {
    consComplex temp = new consComplex();

    temp.real = real + n.real;
    temp.img = img + n.img;
    return (temp); // ----returning the addition of complex nos
  }

  // ----------Implementation part
  public static void main(String[] sh) {

    Scanner sc = new Scanner(System.in);

    int a, b;
    System.out.println("Enter the real and imaginary number: ");
    a = sc.nextInt();
    b = sc.nextInt();

    consComplex c2 = new consComplex(2, 4);
    consComplex c3 = new consComplex(a, b);

    System.out.println("The final inputs are: ");

    c2.showNum();
    c3.showNum();

    // ----displaying addition
    consComplex temp = c2.add(c3);
    System.out.println("The Addition is= " + temp.real + " + " + temp.img + "i");
  }
}
