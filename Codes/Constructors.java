class construct{
    int x,y;
    //non-parameterized
    construct(){
        x=10;
        y=20;
    }
    //parameterized constructors
    construct(int x,int y){
        //this.x is used to refer to the member variable x not the parameter. this.x = x(this x is parameter)
        this.x = x;
        this.y=y;
    }
}
public class Constructors {
    public static void main(String[] args) {
        construct obj1 = new construct(30,40);

        System.out.println(obj1.x+""+obj1.y);
    }
}
