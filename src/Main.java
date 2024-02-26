
public class Main {
    public static void main(String[] args) {
        int monitors = 33;
        int programmers = 30;
        Main main = new Main();
        int result = main.drawisMonitorsCounter(monitors, programmers);
        System.out.println(result);
    }
    public int drawisMonitorsCounter(int monitors, int programmers){
        return   monitors % programmers;
    }
}

