public class Sbi extends RBI {
    private double balance;

    public void withdrow(double amount){
        this.balance-=amount;
    }
    public void blanceInquiry(){
        System.out.println("balance : "+balance);
    }
    public Sbi(double balance){
        this.balance=balance;
    }

    public void addAmount(double amount){
        this.balance+=amount;
    }
}
