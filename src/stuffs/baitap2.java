import java.util.Scanner;

public class baitap2
{
    public static void main (String [] args)
    {
        functionsBaitap2 obj2 = new functionsBaitap2();
        Scanner console = new Scanner(System.in);
        int m = 0;
        int n = 0;
        int [][] arr = new int [m][n];
        System.out.println("1. Nhap ma tran: ");
        System.out.println("2. Tinh tich so boi ba cua hang dau tien");
        System.out.println("3. Tao ra mang co cac phan tu lon nhat nam tren moi hang cua ma tran da nhap");
        System.out.println("4. Quit");
        System.out.print("\tYour feature: ");
        int choice = console.nextInt();
        do
        {
            switch (choice)
            {
                case 1:
                    System.out.println("Nhập số dòng cho ma trận:");
                    m = console.nextInt();
                    System.out.println("Nhập số cột cho ma trận: ");
                    n = console.nextInt();
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            arr[i][j] = console.nextInt();
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int result = obj2.multiply(arr);
                    System.out.print("Tich cac so co boi 3 la: " + result);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Mang cac phan tu lon nhat nam tren moi hang la: ");
                    int [] array3 = obj2.max(arr);
                    for (int i = 0; i < array3.length; i++)
                    {
                        System.out.print("a [" + i + "] = " + arr[i]);
                    }
                    break;
            }
        }while (choice < 0 || choice > 4);
    }
}
