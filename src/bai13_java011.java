import java.util.Scanner;

public class bai13_java011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bấm số để chọn: ");

        System.out.println("1.Tìm theo tên");

        System.out.println("2.Tìm theo tên tác giả");

        System.out.println("3.Tìm theo nhà xuất bản");

        System.out.println("4.Tìm theo tiêu đề");
        int choice = Integer.parseInt(sc.nextLine());

        switch(choice){
            case 1:
                System.out.println("tìm theo tên");
                break;
            case 2:
                System.out.println("tìm theo tên tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Phím không hợp lệ");
                break;
        }
    }
}
