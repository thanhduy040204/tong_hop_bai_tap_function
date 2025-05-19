import java.util.Scanner;

public class bai10_1_CV_DT_HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double cd = sc.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double cr = sc.nextDouble();
        double cv = (cd + cr) *2;
        double dt = cd * cr;

        System.out.println("Chu vi hình chữ nhật là: " + cv);
        System.out.println("Diện tích hình chữ nhật là: " + dt);

    }
}
