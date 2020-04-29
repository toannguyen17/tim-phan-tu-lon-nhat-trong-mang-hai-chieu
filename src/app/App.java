package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng 2 chiều: ");
        int size = scanner.nextInt();
        int[][] arr2c = new int[size][];
        for(int i = 0; i < size; i++){
            System.out.print("\nNhập vào độ dài của phần tử " + i + ": ");
            int sizeChild = scanner.nextInt();
            arr2c[i]      = new int[sizeChild];

            for (int j = 0; j < sizeChild; j++) {
                System.out.print("\nNhập giá trị cho ["+i+"]["+j+"] = ");
                arr2c[i][j] = scanner.nextInt();
            }
        }

        int max = arr2c[0][0];
        for (int i = 0; i < arr2c.length; i++) {
            for (int j = 0; j < arr2c[i].length; j++) {
                if (max < arr2c[i][j]) {
                    max = arr2c[i][j];
                }
            }
        }

        System.out.println("\nGiá trị lớn nhất trong mảng 2 chiều là: " + max);
    }
}
