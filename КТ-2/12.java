import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите два числа:");
        String [] numbers = input.nextLine().split(" ");
        int van = Integer.parseInt(numbers[0]);
        int two = Integer.parseInt(numbers[1]);
        System.out.println("первое число: " + van + "; второе число: " + two);
        if (van != two) {
            compare(van, two);
        }
        else {
            main(args);
        }
    }

    private static void compare(int van, int two) {
        int step =  van > two ? two : van;
        int start = step;
        int end = van > two ? van : two;
        System.out.println("Шаг: " + step + ", начало: " + start + ", кол-во чисел: " + end);
        solve(step, start, end);
    }

    private static void solve(int step, int start, int end) {
        int car = start;
        System.out.print("Числа: " + start + ", ");
        for(int i = 0; i < end-1; i ++) {
            car = (car + step);
            System.out.print(car);
            if (i == end - 1) {
                System.out.print(".");
            }
            else {
                System.out.print(", ");
            }
        }
        System.out.println();
        car = step;
        System.out.print("Квадраты: " + start * start + ", ");
        for(int i = 0; i < end-1; i ++)
        {
            car = (car + step);
            System.out.print(car * car);

            if (i == end - 1) {
                System.out.print(".");
            }
            else {
                System.out.print(", ");
            }
        }
    }
}
