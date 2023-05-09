import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int cat[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            cat[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + cat[i]);
        }
        System.out.println();
        solve(size, cat);
    }
    private static void solve(int size, int[] cat) {
        int count = 0;
        for(int i = 0; i < size; i++)
        {
            count = count + cat[i] * cat[i];
        }
        System.out.println("Square sum: " + count);
    }
}
