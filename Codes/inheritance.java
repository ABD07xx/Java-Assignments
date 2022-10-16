class SuperClass{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return 2*perimeter();
    }
}
class cylinder extends SuperClass{
    public double height;
    public double volume(){
        return area()*height;
    }
    public cylinder(double height, double radius){
        this.height=height;
        this.radius=radius;
    }

}


public class inheritance {
    public static void main(String[] args) {
        double p,s;
        cylinder obj2   = new cylinder(15.678,12.11);
        p = obj2.area();
        s=obj2.volume();
        System.out.println(p+"\n"+s+"\n");

    }

}
