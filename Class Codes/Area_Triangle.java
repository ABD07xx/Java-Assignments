import java.util.Scanner;
import java.lang.Math;
class Triangle{
    Scanner input = new Scanner(System.in);
    int a,b,c;
    float s;

    public void getValues(){
    System.out.println("Enter the sides of triangle ");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    s = (a+b+c)/2;
    //System.out.println("Value of s is :" + s);
}
    public double Area(){
        System.out.println("Value of s is :" + s);
        return Math.sqrt( (s*(s-a)) * (s*(s-b))  * (s*(s-c))    );
    }


}
class Area_Triangle{
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.getValues();
        double area = tri.Area();
        System.out.println("Area of Triangle is: " + area);
    }
}