import java.util.Calendar;
import java.util.Scanner;

public class bai22_viduvandung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoi;
        System.out.print("Nhap ngay sinh: ");
        int ngay = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap thang sinh: ");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nam sinh: ");
        int namSinh = Integer.parseInt(sc.nextLine());
        //khởi tạo
        Calendar birthday = Calendar.getInstance();
        //setup ngay thang nam sinh do ng dung nhập vào
        birthday.set(ngay,thang,namSinh);
        //xuất
        int date = birthday.get(Calendar.DATE);
        int month = birthday.get(Calendar.MONTH);
        int year = birthday.get(Calendar.YEAR);
        System.out.println("Ngay thang nam sinh: "
                            +ngay+"/"
                            +thang+"/"
                            +namSinh);
        //tinh tuoi
        Calendar now = Calendar.getInstance();
        int nowYear = now.get(Calendar.YEAR);
        //tính
        tuoi = nowYear - namSinh;
        System.out.println("Tuoi hien tai cua ban la: "+tuoi);

    }
}
