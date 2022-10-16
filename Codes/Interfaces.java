interface Test2{
    void meth1();
    void meth2();
}
class My implements Test2{


    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }
    public void meth3() {
        System.out.println("Meth3");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Test2 obj1 = new My();
        obj1.meth1();
        obj1.meth2();
        My obj2 = new My();
        obj2.meth3();
    }
}
