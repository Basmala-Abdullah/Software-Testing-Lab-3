import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ClockTest  {
    Clock x;
    String s;
    @Nested
    class buttomUp {
        @BeforeEach
        public void init() {
            x = new Clock();
        }
        @Test
        public void Driver1(){
            s = x.Input('a');
            System.out.println("The date is "+ s);
            assertEquals("The date is "+ s,"The date is "+ x.Y+"-"+x.M+"-"+x.D);
        }
        @Test
        public void Driver2(){
            s = x.Input('a');
            s = x.Input('a');
            System.out.println("It's "+ s);
            assertEquals("It's "+ s,"It's "+ x.h+":"+x.m);
        }
        @Test
        public void Driver3(){
            Clock x = new Clock();
            String[][] times = new String[5][2];
            x.Input('c');
            for(int i = 0 ; i < 5 ; i ++) {
                System.out.print(x.state2);
                times[i][0] = (x.showDate() + " " + x.showDate());
                x.Input('b');
                x.Input('a');
                times[i][1] = (x.showDate() + " " + x.showDate());
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(times[i][j] + " ");
                }
                System.out.println();
            }}
        @AfterEach
        public void erase(){
            x=null ;
        }
    }
}