import java.util.Scanner;

public class Bank
{
    private double p;
    private double n;
    private double r;
    private double a;

    void accept() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        p = in.nextDouble();

        System.out.print("Enter time period in years: ");
        n = in.nextDouble();
    }
    
    void calculate() {
        if (n <= 0.5) {
            r = 9;
        } else if (n <= 1) {
            r = 10;
        } else if (n <= 3) {
            r = 11;
        } else {
            r = 12;
        }

        a = p * Math.pow(1 + (r / 100), n);
    }
    
    void display() {
        System.out.println("Principal\tTime\tRate\tAmount");
        System.out.println(p + "\t" + n + "\t" + r + "\t" + a);
    }
    
    public static void main(String args[]) {
        Bank b = new Bank();
        b.accept();
        b.calculate();
        b.display();
    }
}
