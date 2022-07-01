import java.util.*;
class Isosceles_Triangle{
    public static void main(String[] args) {
        int x, y, z;
        int max, flag=0;
        // x for AB y for BC z for AC
        try ( Scanner input = new Scanner(System.in)) {
            //now calculate max side value among all the sides
            //Take input
            System.out.println("Enter the first side of triangle: ");
             x = input.nextInt();
            System.out.println("Enter the second side of triangle: ");
             y =input.nextInt();
            System.out.println("Enter the third side of triangle: ");
             z = input.nextInt();
        }         
        if (x==y && x==z)
         {
             System.out.println("Triangle is equilateral.");
         }
     
         //isosceles means two sides are of same length
         else if (x==y || y==z || z==x)
         {
             System.out.println("Triangle is isosceles.");
         }
         //right angled means it contains a 90 degree angled which satisfy Pythagoras Theorem
         //check for max side
     
         max = x;
         if (y>max)
             max = y;
         if (z>max)
             max = z;
         if (max == x)
         //Theorem
         {
             if(Math.pow(max,2) == Math.pow(y,2)+Math.pow(z,2))
                 flag=1;
         }
     
         if (max == y)
         //Theorem
         {
             if(Math.pow(max,2) == Math.pow(x,2)+Math.pow(z,2))
                 flag=1;
         }
     
         if (max == z)
         //Theorem
         {
             if(Math.pow(max,2) == Math.pow(x,2)+Math.pow(y,2))
                 flag=1;
         }
     
         if(flag==1)
         {
             System.out.println("Triangle is right angled");
         }
     
    }
    }
