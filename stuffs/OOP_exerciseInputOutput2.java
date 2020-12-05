import java.io.*;

public class OOP_exerciseInputOutput2 {
    public static void main(String[] args) throws IOException {
// write the data out
        DataOutputStream out = new DataOutputStream(new FileOutputStream("D:/data.txt"));
        out.writeInt(888); // ghi s  nguyên
        out.writeLong(12345678); // ghi s  long
        out.writeDouble(123.45678999); // ghi so  thuc chính xác kép
        out.writeFloat(123.12312345f); // ghi so  thuc chính xác
        out.writeBoolean(true); // ghi giá tri  logic
        out.writeUTF("Day la xau ki tu xyzt"); // ghi mot xau
        out.close();
//read it again
        DataInputStream in = new DataInputStream(new FileInputStream("D:/data.txt"));
        try {
            System.out.println("Gia tri nguyen: " + in.readInt()); //doc so nguyen
            System.out.println("Gia tri long: " + in.readLong()); //doc so nguyen dai
            System.out.println("Gia tri double: " + in.readDouble()); //doc so thuc chinh xac kep
            System.out.println("Gia tri float: " + in.readFloat());  //doc so thuc chinh xac
            System.out.println("Gia tri boolean " + in.readBoolean()); //doc gia tri logic
            System.out.println("Gia tri xau: " + in.readUTF()); //doc xau UNICODE
        } catch (Exception e) {
            System.out.println("ERROR !");
        }
        in.close();
    }
}