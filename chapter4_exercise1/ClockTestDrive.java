/*========================================question================================================
BE THE COMPILER

Each of the Java files on this page
represents a complete source file.
Your job is to play compiler and
determine whether each of these files
will compile. If they won't
compile, how would you
fix them?

//------------------------------------------source code--------------------------------------------
class Clock {
    String time;
    void setTime(String t) {
        time = t;
    }
    void getTime() {
        return time;
    }
}
class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: "+tod);
    }
}
*/

/*===========================================Solution==============================================

The above given code in question is incorrect because the return type of getTime() is void but it 
returns String in class Clock. The corrected code is as bellow for class ClockTestDrive which needs 
no change.
output = "time: 1245"
*/
class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: "+tod);
    }
}