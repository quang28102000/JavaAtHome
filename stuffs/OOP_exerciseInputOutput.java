import java.io.*;

public class OOP_exerciseInputOutput {
    public int input()
            throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
    public String nhapvao ()
        throws  IOException
    {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (luongvao);
        String s = br. readLine();
        return String.valueOf(s);
    }

    public void reverse(int m) {
        int remainder = 0;
        int S = 0;
        while (m != 0) {
            remainder = m % 10;
            S = (m % 10) + (S * 10);
            m /= 10;
        }
        System.out.println("Reverse order: " + S);
    }

    public void reverseString (String word)
    {
        int n = word.length() - 1;
        for (int i = n; i >= 0; i--)
        {
            System.out.print(word.charAt(i));
        }
    }

    public static void main(String[] args) {
        OOP_exerciseInputOutput ob1 = new OOP_exerciseInputOutput();
        int n = 0;
        try {
            do {
                System.out.print("Nhap mot so nguyen duong bat ky: ");
                n = ob1.input();
            } while (n < 0);
        } catch (Exception e) {
        }
        ob1.reverse(n);

        OOP_exerciseInputOutput ob2 = new OOP_exerciseInputOutput();
        String s = " " ;
        try
        {
            System.out.print ("Input a string: ");
            s = ob2. nhapvao();
        }catch (Exception e) {}
        ob2. reverseString (s);
    }
}
