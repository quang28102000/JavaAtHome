import java.util.Scanner;

public class baitap1
{
    public static void main(String[] args) {
        funtionsBaitap1 obj = new funtionsBaitap1();
        Scanner console = new Scanner(System.in);

        int n = 0;
        int [] arr = new int [n];
        System.out.println("1. Nhap so phan tu: ");
        System.out.println("2. Odd Sum");
        System.out.println("3. Searching");
        System.out.println("4. Ascending order");
        System.out.println("5. Insert an element into the array");
        System.out.println("6. QUIT!");
        System.out.print("\t Feature: ");
        int choice = console.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.print("So phan tu cua mang: ");
                    n = console.nextInt();

                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("a [" + (i + 1) + "] = ");
                        arr[i] = console.nextInt();
                    }
                    break;
                case 2:
                    obj.oddSum(arr);
                    break;
                case 3:
                    obj.searching(arr);
                    break;
                case 4:
                    obj.sort(arr);
                    break;
                case 5:
                    obj.insert(arr);
            }
        } while (choice > 0 && choice < 6);
    }
}
