class fund{
    protected int x= 10;
    public void set(int z){
        x=z;
    }
    void show(){
        System.out.println(x);
        System.out.println(10+20+"IUST");
        System.out.println("IUST"+10+20);
        System.out.println("IUST"+10*20);
    }
}
public class TestCodes {
    public static void main(String[] args) {
        fund obj1 = new fund();
        obj1.x=20;
        //obj1.set(50);
        obj1.show();

    }
}

