import java.util.Scanner;

public class HomeWorkLesson3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Необходимо угадать число от 0-9");
        int trial = 0;
        int range = 9;
        int number = (int) (Math.random() * range);
        playLevel(range, number, trial);
    }

    private static void playLevel(int range, int number, int trial) {
        while (true) {

            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
                trial++;

            } else {
                System.out.println("загаданное число больше");
                trial++;
            }

            if (trial == 3){
                System.out.println("Попытки закончились");
                break;

            }else {
                System.out.println("Осталось попыток " + trial);
            }

        }




    }


}
