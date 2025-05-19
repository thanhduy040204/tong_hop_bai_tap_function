import java.util.Scanner;

public class    bai12_Toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào một số: ");
        int so = Integer.parseInt(sc.nextLine());;
        String dapSo = (so%2 == 0)? "Số chẵn": "Số lẻ";
        System.out.println(so + " " + dapSo);

    }
}
