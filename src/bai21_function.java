import java.util.Scanner;

public class bai21_function {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c=sum(10,10);
        System.out.println("C= "+c);
        //goi ham xacNhan
        xacNhan("Nam");
        xacNhan("Nu");
    }
    //hàm cộng
    public static int sum(int x ,int y){
        return x+y;
    }

    //hàm xác nhận nhân viên
    public static void xacNhan(String gioiTinh){
        if(gioiTinh.equals("Nam")){
            System.out.println("Xin chao ban la Nam");
        }
        if(gioiTinh.equals("Nu")){
            System.out.println("Xin chao ban la Nu");
        }
    }
}
