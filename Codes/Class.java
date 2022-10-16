import java.util.Scanner;
class Circle{
    static float pie = 3.14f;
    public float radius(float x){
        return 2 * pie * x * x;
    }
}
public class Class {
    public static void main(String[] args) {
        System.out.println("Enter Radius: ");
        Scanner input = new Scanner(System.in);
        float rad = input.nextInt();
        Circle obj1 = new Circle();
        float x = obj1.radius(rad);
        System.out.println("Radius of the circle is " + x);
    }
}
