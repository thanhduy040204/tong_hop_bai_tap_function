import java.util.Scanner;

public class baiTapTongHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // bài 1
//        System.out.println("Nhập số thứ nhất: ");
//        int so1 = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Nhập số thứ hai: ");
//        int so2 = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Nhập số thứ ba: ");
//        int so3 = Integer.parseInt(sc.nextLine());
//        int soLonNhat = timSoLonNhat(so1, so2, so3);
//        System.out.println("Số lớn nhất trong ba số là: "+soLonNhat);
        //bài 2
//        System.out.println("Nhập một số nguyên: ");
//        int a = Integer.parseInt(sc.nextLine());
//        int chanLe = kiemTraSoChanLe(a);
        //bai 3
//        System.out.println("Nhập vào số thứ nhất: ");
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập vào số thứ hai: ");
//        int b = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập vào số thứ ba: ");
//        int c = Integer.parseInt(sc.nextLine());
//        int tong = tinhTongBaSo(a, b, c);
//        System.out.println("Tổng ba số bạn vừa nhập là: "+tong);

        //bài 4
        System.out.println("Nhập vào số thứ nhất: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào số thứ hai: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập phép tính bạn muốn: ");
        System.out.println("1.Cộng");
        System.out.println("2.Trừ");
        System.out.println("3.Nhân");
        System.out.println("4.Chia");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Tổng hai số bạn vừa nhập là: "+phepCong(a,b));
                break;
            case 2:
                System.out.println("Hiệu hai số bạn vừa nhập là: "+phepTru(a,b));
                break;
            case 3:
                System.out.println("Tích hai số bạn vừa nhập là: "+phepNhan(a,b));
                break;
            case 4:
                System.out.println("Thương hai số bạn vừa nhập là: "+phepChia(a,b));
                break;
        }





    }

    public static int timSoLonNhat(int a, int b, int c){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public static int kiemTraSoChanLe(int n){
        if(n % 2 == 0)
            System.out.println("số chẵn");
        else
            System.out.println("số lẻ");
        return n;
    }

    public static int tinhTongBaSo(int n, int m, int k){
        return n + m + k;
    }

    public static double phepCong(double a , double b){
        return a + b;
    }

    public static double phepTru(double a , double b){
        return a - b;
    }
    public static double phepNhan(double a , double b){
        return a * b;
    }
    public static double phepChia(double a , double b){
        return a / b;
    }
}
