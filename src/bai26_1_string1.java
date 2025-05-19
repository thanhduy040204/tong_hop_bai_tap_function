import java.util.Scanner;

public class bai26_1_string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //buổi 1
        String s ="Hoi do toi che mom em rong" + "\nKhong tin hai dua chap mom do.";
        System.out.println(s);
        //7. các phương thức thường dùng
        //7.1 append: Thêm vào cuối chuỗi
        StringBuilder chuoi = new StringBuilder();
        chuoi.append("Xin chào, ");
        chuoi.append("mình mới học lập trình");
        chuoi.append(" ,rất vui được gặp bạn ");
        System.out.println(chuoi);
        //7.2 insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(2,"bạn");
        System.out.println(chuoi);
        chuoi.delete(2,5);
        System.out.println(chuoi);
        //7.4 chuoi.length: trả về độ dài của chuỗi tính luôn cả space
        System.out.println(chuoi.length());

        //buổi 2
        //7.5 IndexOf: kiem tra vi tri xuat hien dau tien cua ky tu hoac chuoi
        // tra ve -1 neu khong tim thay
        String s7 =" toi di tim toi";
        System.out.println(s7.indexOf("toi"));
        //7.6 lastIndex0f: tra ve vi tri index xuat hien cuoi cung cua ky tu hoac chuoi
        // tra ve -1 neu khong tim thay
        System.out.println(s7.lastIndexOf("toi"));
        //7.7 Contains: kiem tra chuoi con
        String s9=".mp3";
        String s10="tuhoc.mp3";
        //kiem tra s10 co chua cum tu String cua s9 ko?
        boolean check = s10.contains(s9);
        if (check)
            System.out.println("co chua .mp3");
        else
            System.out.println("ko tim thay .mp3 trong chuoi");
        //7.8 Substring: trich loc chuoi con tu chuoi ban dau
        //substring(int beginIndex)
        //substring(int beginIndex, int endIndex)
        String s11="12345678";
        String s12= s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13= s11.substring(4,7);
        System.out.println(s13);

        //7.9 replace("str old","str new")
        String s14=" Toi di tim toi";
        String s15=s14.replace(" Toi"," Ban");
        System.out.println(s14);
        System.out.println(s15);
        //7.10 replaceFirst("str old","str new")
        String s16=s14.replaceFirst("Toi"," Ban");
        System.out.println(s16);
        //7.11 trim(): xoa toan bo khoang trang o dau va o cuoi
        String s18="         ga lai lap trinh           ";
        String s19 = s18.trim();
        System.out.println(s18);
        System.out.println(s19);
    }
}
