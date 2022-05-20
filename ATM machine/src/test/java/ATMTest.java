import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ATMTest{
    ATM a;
    Deposit d;
    Withdraw w;
    String s;
    @BeforeEach
    public void init() {
        a = new ATM();
        d = new Deposit();
        w = new Withdraw();
    }
    class InsertMoney{
        int insert(int a){
            if(a>0)
                return a;
            else
                return 0;
        }
    }
    @Test
    public void stub1(){
        InsertMoney y = new InsertMoney();
        a.doTheWork(2,y.insert(1000));
        assertEquals(a.balance,1000.0);
    }
    @Test
    public void stub2(){
        InsertMoney y = new InsertMoney();
        double check =w.withdraw(2000,y.insert(3000));
        assertEquals(check,1000.0);
    }
    @Test
    public void stub3(){
        InsertMoney y = new InsertMoney();
        double check = d.deposit(4000,y.insert(3000));
        assertEquals(check,7000.0);
    }
    @AfterEach
    public void clean(){
        a=null ;
    }
}