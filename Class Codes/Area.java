import java.util.*;
class Circle{
     Scanner input = new Scanner(System.in);
     double pie = 3.14;
     int radius;
void getvalues(){
    System.out.println("Enter the Radius: ");
    radius = input.nextInt();
}
//Parametized Constructor
  //  Circle(int r){
   // radius = r;}
//Unparametized Constructor
  Circle(){
    radius = 0;
  }
   public double getArea(){
    return (pie * radius * radius);}

   public double getParameter(){
    return (2*pie*radius);}

}
public class Area{
    public static void main(String[] args) {
        Circle get = new Circle();//if values passed here it will pass it to radius using constructor
        get.getvalues();
        double area = get.getArea();
        double param = get.getParameter();
        System.out.println("Area of circle is " + area + "and circumfrence is " + param);
    }
}