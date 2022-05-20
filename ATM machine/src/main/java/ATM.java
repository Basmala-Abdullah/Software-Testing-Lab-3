public class ATM {
    double balance = 0;
    Withdraw w = new Withdraw();
    Deposit d = new Deposit();
    public double doTheWork(int x, double amount) {
        switch(x)
        {
            case 1:
                this.balance =w.withdraw(amount,balance);
            case 2:
                this.balance = d.deposit(amount,balance);
        }return balance;}
    public static void main(String args[] ) {
    }
}
 class Withdraw {
    double withdraw(double amount, double balance){
        if(balance >= amount)
            return balance - amount;
        else
            return balance;
    }
}
 class Deposit
{
    public double deposit(double amount, double balance){
        if(amount<=0)
            return balance;
        balance = balance + amount;
        return balance;
    }
}