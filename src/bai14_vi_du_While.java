import java.util.Scanner;

public class bai14_vi_du_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số từ 1 -> 99: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n < 1 || n > 99){
            System.out.println("Chỉ duoc nhap so tu 1 -> 99: ");
            n = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Ban da nhap so: "+n);

    }
}
