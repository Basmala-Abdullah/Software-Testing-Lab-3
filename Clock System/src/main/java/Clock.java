public class Clock {
    public String state0 = "NORMAL";
    public String state1 = "TIME";
    public String state2 = "minute ";
    public String state3 = "ALARM";
    int m=0,h=0, D=1,M=1, Y=2000;
    String Input(char i){
        switch(state0) {
            case "NORMAL": {
                if (i == 'c')
                    this.state0 = "UPDATE";
                if (i == 'b')
                    this.state0 = "ALARM";
                if (i == 'a')
                    if (state1 == "TIME") {
                        state1 = "DATE";
                        return this.showDate();
                    }
                    else{
                        state1 = "TIME";
                        return this.showTime();
                    }
                return state0;
            }
            case "UPDATE": {
                if (i == 'd')
                    state0 = "NORMAL";
                else if (i == 'c')
                    state0 = "UPDATE";
                else {
                    switch (state2) {
                        case "min": {
                            if (i == 'a')
                                state2 = "hour";
                            if (i == 'b'){
                                this.m = (m+1)%60;
                                return this.showTime();
                            }
                            break;
                        }
                        case "hour": {
                            if (i == 'a')
                                state2 = "day";
                            if (i == 'b'){
                                this.h= (h+1)%12 +1;
                                return this.showTime();
                            }break;
                        }
                        case "day": {
                            if (i == 'a')
                                state2 = "month";
                            if (i == 'b'){
                                this.D= (D+1)%30+1;
                                return this.showTime();}break;
                        }
                        case "month": {
                            if (i == 'a')
                                state2 = "year";
                            if (i == 'b'){
                                this.M= (M+1)%12+1;
                                return this.showTime();
                            }break;
                        }
                        case "year": {
                            if (i == 'a')
                                state0 = "NORMAL";
                            if (i == 'b'){
                                this.Y= (Y+1);
                                return this.showTime();
                            }
                        }break;
                    }
                }
                return state0;
            }
            case "ALARM":{
                if(i == 'd'){
                    state0 = "NORMAL";
                    return state0;
                }
                else if (i == 'a')
                    if(state3 == "ALARM"){
                        state3 = "CHIME";
                        return state3;
                    }
                    else{
                        state0 = "ALARM";
                        return state3;
                    }}
            return state0;
        }
        return state0;
    }
    String showDate(){
        System.out.println(Y+"-"+M+"-"+D);
        return (Y+"-"+M+"-"+D);
    }
    String showTime(){
        System.out.println( h+":"+m);
        return ( h+":"+m);
    }
}