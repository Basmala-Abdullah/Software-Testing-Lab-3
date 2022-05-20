import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CoffeeTest{
    Coffee x;
    MyStock k;
    Pounds p;
    String s;
    @BeforeEach
    public void init() {
        x = new Coffee();
        k = new MyStock();
        p = new Pounds();
    }
    class InsertionCoin{
        int insert(int y){
            if(y>0)
                return y;
            else
                return 0;
        }
    }
    @Test
    public void coffee(){
        InsertionCoin y = new InsertionCoin();
        x.despence(y.insert(5));
        assertEquals(x.s.Mystock,5);
    }
    class Coffeedouble{
        String checkAbility(int x){if(x%2==0)
            return "Horaay! You can have your double coffees!";
        else
            return "Oops! You can't have the double coffees";
        }
    }@Test
    public void stockDriver(){
        Coffeedouble y = new Coffeedouble();
        s = y.checkAbility(k.showAvailablity());
        assertEquals(s,"Horaay! You can have your double coffees!");
        k.deductStock();
        s = y.checkAbility(k.showAvailablity());
        assertEquals(s,"Oops! You can't have the double coffees");
    }
    @AfterEach
    public void clean(){
        x=null ;
    }
}
