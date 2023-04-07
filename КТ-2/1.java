import java.util.*;
public class Pandora {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Введите кол-во строк: ");
        m=sc.nextInt();

        System.out.println("Введите кол-во столбцов: ");
        n=sc.nextInt();
        int cat[][]=new int[10][10];
        System.out.println("Введите элементы матрицы: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                cat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Элементы матрицы до транспонирования: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(cat[i][j]+" ");
            }
            System.out.println("");
        }

        int dog[][]=new int[10][10];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dog[j][i]=cat[i][j];
            }
        }

        System.out.println("Элементы матрицы после транспонирования");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(dog[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
