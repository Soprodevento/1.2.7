import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int monitors = main.drawisMonitorsCounter();
        System.out.println("Количество мониторов " + monitors);
    }
    public int drawisMonitorsCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличесвто мониторов: ");
        int monitors = scanner.nextInt();
        System.out.print("Введите количество прогроаммистов: ");
        int programmers = scanner.nextInt();
        if( monitors < programmers){
            System.out.println("Мониторов не хватает");
        }
        monitors = monitors - programmers;
        return monitors;
    }
}
