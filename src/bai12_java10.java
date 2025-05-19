import java.util.Scanner;

public class bai12_java10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình của bạn: ");
        double dtb = Double.parseDouble(sc.nextLine());
        String xepLoai = (dtb>=8)? "Giỏi":
                (8 > dtb && dtb >= 6.5)? "Khá" :
                        (dtb >= 5 && dtb < 6.5) ? "Trung Bình" :
                                (dtb < 5)? "yếu": "Nhập sai";
        System.out.println("Điểm số của bạn là: " + dtb +" xếp loại học lực " + xepLoai);
    }
}
