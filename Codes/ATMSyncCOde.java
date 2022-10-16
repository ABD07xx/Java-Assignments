class ATM{
    synchronized public void checkBalance(String name){
        System.out.println(name + " Checking Balance");
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    synchronized public void Withdraw(String name, int amount){
        System.out.println(name + "Withdrawing Money");
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(amount + "Withdrawn by " + name);
    }
}
class Customer  extends Thread{
    String name;
    int amount;
    ATM atm;
    Customer(String n,int a,ATM at){
        this.name = n;
        this.amount   = a;
        this.atm      = at;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.Withdraw(name,amount);
    }
    public void run(){
        useATM();
    }
}

public class ATMSyncCOde {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Simth",10000,atm);
        Customer c2 = new Customer("John",20000,atm);
        Customer c3 = new Customer("Mike",30000,atm);
        c1.start();
        c2.start();
        c3.start();
    }
}
