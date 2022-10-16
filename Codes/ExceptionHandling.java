import java.util.Scanner;

public class ExceptionHandling{
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = input.nextInt();
        b = input.nextInt();
        try {
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e ) {
            System.out.println("Divide by Zero");
        }

        System.out.println("Bye");
    }
}
