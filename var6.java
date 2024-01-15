import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class var6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("i");
        try {
            int a = sc.nextInt();
            System.out.println("j");
            int b = sc.nextInt();
            int[][] arr = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.println("Введите " + "[" + i + "]" + "[" + j + "]");
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(Arrays.deepToString(arr));
            System.out.println("Введите номер строки");
            int k = sc.nextInt();
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[k-1][j] +" ");
            }
        } catch (InputMismatchException ie) {
            System.out.println("Ввод строки вместо числа");
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Нет такого номера строки");
        }
    }
}