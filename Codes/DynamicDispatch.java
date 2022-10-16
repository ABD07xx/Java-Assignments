class OldCar{
    public void start(){
        System.out.println("Car has been started");
    }
    public void acceleration(){
        System.out.println("Car is going to be accelerated upto 20kmph");
    }
    public void engine(){
        System.out.println("Engine 800cc");
    }
}
class NewCar extends OldCar{
    public void start(){
        System.out.println("New Car has been started");
    }
    public void acceleration(){
        System.out.println("New Car is going to be accelerated upto 50kmph");
    }
    public void engine(){
        System.out.println("Engine 1200cc");
    }
    public void sunroof(){
        System.out.println("Sunroof has been opened");
    }
        }

public class DynamicDispatch {
    public static void main(String[] args) {
        //Dynamic Dispatch
        OldCar object = new NewCar();
        object.start(); //shadow old car
        object.acceleration();//shadow old car
        object.engine();//shadow old car
        //object.sunroof(); will produce an error as reference is of old car and old car doesnt have a sunroof
    }
}
