import java.util.*;
class Valid{
    public static void main(String[] args) {
        int x, y, z;
        int max, valid=0;
        // x for AB y for BC z for AC
        Scanner input = new Scanner(System.in);         
        //now calculate max side value among all the sides
        //Take input
        System.out.println("Enter the first side of triangle: ");
         x = input.nextInt();
        System.out.println("Enter the second side of triangle: ");
         y =input.nextInt();
        System.out.println("Enter the third side of triangle: ");
         z = input.nextInt();
    
        max = x;
    
        if(max<y)
            max=y;
    
        if(max<z)
            max=z;
    
        //now check for validation rules
        //if largest side is lower than the sum of two remaining sides
        if(max == x && x < (y+z))
            valid = 1;
    
        if(max == y && y < (x+z))
            valid = 1;
    
        if(max == z && z < (x+y))
            valid = 1;
    
    if (valid==1)
        System.out.println("Triangle is valid");
    else
        System.out.println("Triangle is not valid");
    }
    }
