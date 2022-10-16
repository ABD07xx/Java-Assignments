class AbsSuper{
    public AbsSuper(){
        System.out.println("Concrete class Constructor");
    }
    public void method1(){
        System.out.println("Method of Concrete class");
    }
}
abstract class AbsSuper1{
    public AbsSuper1(){
        System.out.println("Inside Abstract class");
    }
    public void method3(){
        System.out.println("Inside Abstract class");
    }
    abstract void method2();
}
class AbsSuper2 extends AbsSuper1{
    public void method2(){
        System.out.println("Inside Abstract/concrete class");
        }
}
public class AbstractClass {
    public static void main(String[] args) {
    AbsSuper s = new AbsSuper();
    s.method1();
    AbsSuper2 s2 = new AbsSuper2();
    s2.method2();
    s2.method3();
    }
}
