import java.util.Scanner;

public class bai10_CV_DT_HINHTRON {
    public static void main(String[] args) {
        // bài tập 02
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        double r = sc.nextDouble();
        double cv = 2*Math.PI*r;
        double dt = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi hình tròn là: " + cv);
        System.out.println("Diện tích hình tròn là: " + dt);
    }
}
