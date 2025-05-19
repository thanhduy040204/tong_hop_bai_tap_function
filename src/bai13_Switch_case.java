import java.util.Scanner;

public class bai13_Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            System.out.println("Nhập 1 số: ");
            int n = Integer.parseInt(sc.nextLine());
            int div = n%2;
        // kiểm tra chẳn lẻ bằng switch case
            switch (div) {
                case 0:
                    System.out.println(n+" số chẵn");
                    break;
                default:
                    System.out.println(n+" số lẻ");
                    break;
        }
         */
        System.out.println("Nhập vào 1 tháng: ");
        int thang = Integer.parseInt(sc.nextLine());
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(thang +" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(thang +" có 30 ngày");
                break;
            case 2:
                System.out.println("Có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Không có tháng bạn nhập");
                break;
        }



    }
}
