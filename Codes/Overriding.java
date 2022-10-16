class Super {
    void display() {
        System.out.println("Super class Display");
    }
}
class Sub extends Super{
    void display(){
        System.out.println("Sub class Display");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Super obj1 = new Super();
        obj1.display();
        Sub obj2  = new Sub();
        obj2.display();
        Super obj3 = new Sub();
        obj3.display();
    }
}
