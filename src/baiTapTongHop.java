import java.util.Scanner;

public class baiTapTongHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int so1 = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập số thứ hai: ");
        int so2 = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập số thứ ba: ");
        int so3 = Integer.parseInt(sc.nextLine());
        timSoLonNhat(so1, so2, so3);

    }

    public static int timSoLonNhat(int a, int b, int c){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println("Số lớn nhất trong ba số là: "+max);
        return max;
    }
}
