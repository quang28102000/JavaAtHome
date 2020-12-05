import java.util.Scanner;

public class funtionsBaitap1
{

        public int oddSum(int arr[]) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] % 2) != 0) {
                    sum += arr[i];
                }
            }
            return sum;
        }

        public void searching(int arr[]) {
            Scanner console = new Scanner(System.in);
            System.out.print("Nhap ki tu can tim: ");
            int a = console.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == a) {
                    System.out.println("Co phan tu nay trong mang");
                } else {
                    System.out.println("Khong co phan tu nay trong mang");
                    break;
                }
            }
        }

        public static void sort(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                int temp = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println("a[" + i + "] = " + arr[i]);
            }
        }

        public void insert(int arr[]) {
            Scanner console = new Scanner(System.in);

            System.out.println("Nhap so ma ban muon them vao");
            int a = console.nextInt();

            int number = arr.length - 1;
            int tempNumber = arr.length;
            int[] arr2 = new int[tempNumber + 1];
            boolean inserted = false;

            for (int i = tempNumber; i >= 0; i--) {
                if (number > -1 && arr[number] > a) {
                    arr2[i] = arr[number--];
                } else {
                    if (!inserted) {
                        arr2[i] = a;
                        inserted = true;
                    } else {
                        arr2[i] = arr[tempNumber--];
                    }
                }
            }
            sort(arr);
            System.out.println("Mang duoc sap xep lai sau khi chen: ");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(+arr2[i] + " ");
            }
        }
}
