import java.util.*;

class person {
    long mob;
    int age;
    long adhr;
    Scanner sc = new Scanner(System.in);

    int getinfo() {
        System.out.println("Enter your Age");
        age = sc.nextInt();
        System.out.println("Enter your adhaar number");
        adhr = sc.nextLong();
        System.out.println("Enter your Mobile number number");
        mob = sc.nextLong();
        return 0;
    }

    void showinfo() {

        System.out.println("\t   HUMAN INFO\n");
        System.out.println("Age:-" + age + "\n" + "Adhar no.-" + adhr + "\n" + "Mobile number:-" + mob);
    }

}// ---end of employee class

class employee extends person {

    int emp_id, salary, branch_n0;

    int getinfo() {
        super.getinfo();
        System.out.println("Enter the emp_id :");
        emp_id = sc.nextInt();
        System.out.println("Enter the Salary :");
        salary = sc.nextInt();
        System.out.println("Enter the branch_n0 :");
        branch_n0 = sc.nextInt();
        return 0;
    }

    void showinfo() {
        super.showinfo();

        System.out.println("The Employee ID is : " + emp_id + "\n" + "The salary is : " + salary + "\n"
                + "The Branch no is : " + branch_n0);

    }
}// ---end of employee class

class manager extends person {

    int x, salary;

    int getinfo() {

        super.getinfo();
        System.out.println("Enter the incentive :");
        x = sc.nextInt();
        System.out.println("Enter the Current Salary :");
        salary = sc.nextInt();

        return salary = salary * x;
    }

    void showinfo() {
        System.out.println("The salary of the manager is :" + salary);
    }
}// ---end of manager class

class heira {
    public static void main(String[] args) {

        manager e1 = new manager();

        e1.getinfo();
        e1.showinfo();

    }// ---end of public

}// ---end of heira class