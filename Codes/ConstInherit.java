class Parent{
    public Parent(){
        System.out.println("Inside Parent class");
    }
}
class child extends parent {
    public child() {
        System.out.println("Inside Child class");
    }
}
class grandchild extends child{
    public grandchild(){
        System.out.println("Inside GrandChild Class");
    }
}
public class ConstInherit {
    public static void main(String[] args) {
        parent obj1 = new parent();
        child  obj2 = new child();
        grandchild obj3 = new grandchild();
    }
}
