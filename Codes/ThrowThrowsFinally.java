class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions are negative";
    }
}
public class ThrowThrowsFinally {
static int area(int len, int breadth) throws NegativeDimensionException
{
    if(len<0 || breadth<0){
        throw new NegativeDimensionException();
    }
    return len*breadth;
}
static void meth1() throws NegativeDimensionException
{

    System.out.println("Area is " + area(10,-5));
}

    public static void main(String[] args) {
        try {
            meth1();
        }
        catch (NegativeDimensionException e){
            System.out.println(e);
        }
    }
}
