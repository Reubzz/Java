import java.util.*;

class Complex {

  Scanner sc = new Scanner(System.in);

  int real;
  int img;

  void getcomp() {
    real = sc.nextInt();
    img = sc.nextInt();
  }

  void showcomp() {
    System.out.print(real + "+" + img + "i\n");

    System.out.println("-----------------------------------------------------------");
  }

  Complex addreal(Complex C2) {
    Complex temp = new Complex();
    temp.real = real + C2.real;
    temp.img = img + C2.img;
    return (temp);
  }

  Complex subcomp(Complex C2) {
    Complex temp = new Complex();
    temp.real = real - C2.real;
    temp.img = img - C2.img;
    return (temp);
  }

  Complex multcomp(Complex C2) {
    Complex temp = new Complex();
    temp.real = real * C2.real;
    temp.img = img * C2.img;
    return (temp);
  }

  public static void main(String[] fuz) {

    Complex C1 = new Complex();// ---getcomp
    Complex C2 = new Complex();// ---2nd complex
    Complex C3 = new Complex();// ---addcomp
    Complex C4 = new Complex();// ---subcomp
    Complex C5 = new Complex();// ---multcomp

    System.out.println("-----------------------------------------------------------");

    System.out.print("Enter the 1st Complex number");
    C1.getcomp();
    System.out.print("The 1st Complex number is:-");
    C1.showcomp();

    System.out.print("Enter the 2nd Complex number");
    C2.getcomp();
    System.out.print("The 2nd Complex number is:-");
    C2.showcomp();

    System.out.print("The Addition of two Complex number is:-");
    C3 = C1.addreal(C2);
    C3.showcomp();

    System.out.print("The Subtraction of two Complex number is:\n");
    C4 = C1.subcomp(C2);
    C4.showcomp();

    System.out.print("The Multiplication of two Complex number is:\n");
    C5 = C1.multcomp(C2);
    C5.showcomp();

  }// ---end of main
}// ---end of class