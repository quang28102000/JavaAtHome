import java.io.*;

public class OOP_exercise6 {
    public int nhapso()
            throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }

    public void TongTichCacChuSo(int m) {
        int S = 0, P = 1;
        while (m != 0) {
            S += m % 10;
            P *= m % 10;
            m /= 10;
        }
        System.out.println("Tong cac chu so la = " + S);
        System.out.println("Tich cac chu so la = " + P);
    }

    public static void main(String argx[]) {
        OOP_exercise6 dt = new OOP_exercise6();
        int m = 0;
        try {
            do {
                System.out.print("Nhap mot so nguyen duong:");
                m = dt.nhapso();
            } while (m < 0);
        } catch (Exception e) {
        }
        System.out.println("So da nhap lai: " + m);
        dt.TongTichCacChuSo (m);
    }
}
