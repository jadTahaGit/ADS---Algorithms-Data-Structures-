class Time {
        int h,  m , s;


    static Time convert (int sec){
            Time t = new Time();
            t.h = sec/3600;
            t.m = (sec%3600)/60;
            t.s = (sec%60);
            System.out.println(t);
            return t;
        }

        public static void main(String[] args) {
            convert(5);
        }
        

    }
    
    
class Date {
        int day;
        String month;
        int year;        
    }
    
