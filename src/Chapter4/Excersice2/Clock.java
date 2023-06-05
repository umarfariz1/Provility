package Chapter4.Excersice2;
// Be a compiler
// Debugging the program
class Clock {
    private String time;
    public void setTime(String t) {
        time = t;
    }
   public String getTime() { //Return type is not mentioned
        return time;
    }
}
class ClockTestDrive {
    public static void main(String [] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
