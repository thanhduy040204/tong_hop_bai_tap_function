import java.util.Scanner;

public class bai11_java04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tổng 2 số: ");
        double tong = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào hiệu 2 số: ");
        double hieu = Double.parseDouble(sc.nextLine());

        double x = (tong + hieu)/2;
        double y = tong - x;

        System.out.println("Giá trị x cần tìm là: " + x);
        System.out.println("Giá trị y cần tìm là: " + y);


    }
}
