import java.util.Scanner;

public class bai11_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm trung bình của bạn: ");
        double dtb = Double.parseDouble(sc.nextLine());
        if(8 <= dtb && dtb <=10){
            System.out.println("Bạn đạt loại giỏi");
        }else if(6.5<= dtb && dtb < 8){
            System.out.println("Bạn đạt loại khá");
        }else if(5<= dtb && dtb <=6) {
            System.out.println("Bạn đạt loại trung bình");
        }else
            System.out.println("Bạn đạt loại yếu");
    }
}
