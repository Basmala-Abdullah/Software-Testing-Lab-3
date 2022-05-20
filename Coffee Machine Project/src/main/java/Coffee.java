public class Coffee {
    Pounds p = new Pounds();
    MyStock s = new MyStock();
    public void Mycoffee(int s){
        this.s.increaseStock(s);
    }
    void despence(int y){
        while(y>0 && s.checkIfEmpty()){
            System.out.println("Have your Coffee!");
            p.addingOnePound();
            s.deductStock();
            y--;
        }
        if (y!=0)
            System.out.println("Oops! machine is empty");
    }
    void status(){
        System.out.println(p.checkIfEmpty()+" coins are there\n"+s.checkIfEmpty()+" coffees in stock are there\n");
    }
}

class Pounds {
    int p = 0;
    boolean checkIfEmpty(){
        if(p>0)
            return true;
        else
            return false;
    }
    void addingOnePound(){
        p++;
    }
    void reset(int c){
        p =0;
    }
}
class MyStock {
    int Mystock=10;
    boolean checkIfEmpty(){if(Mystock>0)
        return true;
    else
        return false;
    }    void deductStock(){
        Mystock -=1;
    }
    void reset(){
        Mystock =0;
    }
    void increaseStock(int add){
        Mystock +=add;
    }

    int showAvailablity(){
        return Mystock;
    }
}