import java.util.*;
public class OOP_exerciseAtClass {
    public static void main(String[] args) {
        bai1(3);
        bai2(3);
        bai3(3);
        bai4(16);
        //bai 5
        System.out.print ("5) Cac so nguyen to nho hon 20 la: ");
        for (int i = 0; i < 20; i++)
        {
            if (bai5(i))
            {
                System.out.print(i + " ");
            }
        }

        bai6 (1000);
        //bai 7
        System.out.println();
        System.out.print ("7) 10 so dau tien cua day fibonacci la: ");
        for (int i = 1; i <= 10; i++)
        {
            System.out.print (bai7(i) + " ");
        }

        //bai 8
        System.out.println();
        bai8 (5);
        //bai 9
        bai9 (123321);

    }

    public static void bai1(int n) {
        float sum = 0;
        float temporary = 1;
        for (int i = 1; i <= n; i++) {
            temporary *= i;
            sum += (float) (1 / temporary);
        }
        System.out.println("1) Sum = " + Math.round(sum * 100.0) / 100.0);
    }

    public static void bai2(int n) {
        float tich = 1;
        float temporary = 0;
        for (int i = 1; i <= n; i++) {
            temporary *= i;
            tich *= (float) Math.pow(-1, n) * (float) (1 / temporary);
        }
        System.out.println("2) Sum = " + Math.round(tich * 100.0) / 100.0);
    }

    public static void bai3(int n) {
        float sum = 0;
        float temporary = 1;
        for (int i = 1; i <= n; i++) {
            temporary *= ((2 * i) - 1);
            sum += (float) (1 / temporary);
        }
        System.out.println("3) Sum = " + Math.round(sum * 100.0) / 100.0);
    }

    public static void bai4(int n) {
        int temporary = (int) Math.sqrt(n);
        if (Math.pow(temporary, 2) == n) {
            System.out.println("4) " + n + " la so chinh phuong");
        } else {
            System.out.println("4) " + n + " khong phai la so chinh phuong");
        }
    }
    public static boolean bai5(int n)
    {
        if (n < 2)
        {
            return false;
        }
        int squareNumber = (int) Math.sqrt(n);
        for (int i = 2; i <= squareNumber; i++)
        {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void bai6 (int n)
    {
        int sum;
        System.out.print ("\n6) ");
        for (int i = 2; i <= n; i++)
        {
            sum = 1;
            for (int j = 2; j <= i / 2; j++)
            {
                if (i % j == 0)
                {
                    sum += j;
                }
            }
            if (sum == i)
            {
                System.out.print (" " + i);
            }
        }
    }
    public static int bai7 (int n)
    {

        if (n < 0)
        {
            return -1;
        } else if (n == 0 || n == 1)
        {
            return n;
        } else
        {
            return bai7(n - 2) + bai7 (n - 1);
        }
    }
    public static void bai8 (int n)
    {
        int i = 0;
        while (n > bai7(i))
        {
            ++i;
        }
        if (n == bai7(i))
        {
            System.out.println("8) " + n + " la so thuoc day Fibonacci");
        }else
        {
            System.out.println("8) " + n + " khong phai la so thuoc day Fibonacci");
        }
    }
    public static void bai9 (int n)
    {
        int reverse = 0;
        int remainer, temporary;
        temporary = n;
        while (temporary != 0)
        {
            remainer = temporary % 10;
            reverse = (reverse * 10) + remainer;
            temporary = temporary / 10;
        }
        if (reverse == n)
        {
            System.out.println ("9) " + n + " la so doi xung");
        }else
        {
            System.out.println ("9) " + n + " khong doi xung");
        }
    }
}

