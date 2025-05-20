import java.util.Scanner;

public class Lap_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // bài 1: Viết chương trình nhập vào 2 số nguyên m, n. Xác định và xuất số nguyên lớn nhất.
//        System.out.println("Nhập vào số nguyên m: ");
//        int m  = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập vào số nguyên n: ");
//        int n = Integer.parseInt(sc.nextLine());
//        //xác định và xuất ra số lớn nhất
//        int max = m;
//        if(n > max){
//            max = n;
//        }
//        System.out.println("Số nguyên lớn nhất bạn vừa nhập là: "+max);

        // bài 2: Cho người dùng nhập vào 3 số nguyên, viết chương trình xuất 3 số theo thứ tự tăng dần
//        System.out.println("Nhập vào số nguyên thứ nhất: ");
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập vào số nguyên thứ hai: ");
//        int b = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập vào số nguyên thứ ba: ");
//        int c = Integer.parseInt(sc.nextLine());
//        int max;
//        if(a>b){
//            max = a; a=b; b = max;
//        }
//        if(a>c){
//            max = a; a=c; c = max;
//        }
//        if(b>c){
//            max = b; b = c; c = max;
//        }
//        System.out.println("Theo thứ tự tăng dần: "+ a+","+b+","+c);

        // bài 3: Cũng yêu cầu như câu 2, nhưng cho phép Hỏi người dùng muốn xuất theo thứ tự nào, nếu
        //người dùng chọn 1 thì xuất Tăng dần, người dùng chọn 2 thì xuất giảm dần
//        System.out.println("Nhập a: ");
//        int a = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Nhập b: ");
//        int b = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Nhập c: ");
//        int c = Integer.parseInt(sc.nextLine());
//        System.out.println("Bạn muốn in theo thứ tự nào ?");
//        System.out.println("1. Tăng dần");
//        System.out.println("2. Giảm dần");
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                int max;
//                if(a>b){
//                    max = a; a = b; b = max;
//                }
//                if(a>c){
//                    max = a; a = c; c = max;
//                }
//                if(b > c){
//                    max = b; b = c; c = max;
//                }
//                System.out.println("Theo thứ tự tăng dần: "+ a+","+b+","+c);
//                break;
//            case 2:
//                int min;
//                if(a<b){
//                    min = a; a = b; b = min;
//                }
//                if(a<c){
//                    min = a; a = c; c = min;
//                }
//                if(b < c){
//                    min = b; b = c; c = min;
//                }
//                System.out.println("Theo thứ tự giảm dần: "+ a+","+b+","+c);
//                break;
//            default:
//                System.out.println("Bạn nhập sai lựa chọn");
//        }

        // bài 4: Hãy viết chương trình “Chào Hỏi" các thành viên của gia đình có đặc điểm sau đây: đầu
        //tiên máy sẽ hỏi ai đang sử dụng máy. Sau đó căn cứ vào câu trả lời nhận được mà máy cần
        //đưa ra một câu chào hợp lý, dễ thương. Giả sử trong gia đình có 4 thành viên là : Bố (B),
        //Mẹ (H), anh trai (A) và em gái (E)
//        System.out.println("Tôi là máy! cho tôi hỏi người đang sử dụng máy tính là ai ?:  ");
//        String xacMinh = sc.nextLine();
//        if(xacMinh.equals("B") || xacMinh.equals("b")){
//            System.out.println("Chào bố nhé");
//        }else if(xacMinh.equals("H") || xacMinh.equals("h")){
//            System.out.println("Chào mẹ nhé");
//        }else if(xacMinh.equals("A") || xacMinh.equals("a")){
//            System.out.println("Chào anh trai nhé");
//        }else if(xacMinh.equals("E") || xacMinh.equals("e")){
//            System.out.println("Chào em gái nhé");
//        }else{
//            System.out.println("Hehe, tui biết bạn không phải người nhà của tôi ^^");
//        }
            // bài5: Viết chương trình nhập vào 3 số thực. Hãy thay tất cả các số âm bằng trị tuyệt đối
        //của nó.
//        System.out.println("Nhập a: ");
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập b: ");
//        int b = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập c: ");
//        int c = Integer.parseInt(sc.nextLine());
//        System.out.println("Kết quả: "+"a= "+Math.abs(a)+" b= "+Math.abs(b)+" c= "+Math.abs(c));

       // bài 6: Nhập tên và năm sinh của 3 sinh viên. Hãy viết chương trình xuất ra tên và năm sinh
        //của sinh viên trẻ nhất.
//        System.out.println("Nhập tên sinh viên thứ nhất: ");
//        String name = sc.nextLine();
//        System.out.println("Nhập năm sinh của sinh viên thứ nhất: ");
//        int year = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Nhập tên sinh viên thứ hai: ");
//        String name1 = sc.nextLine();
//        System.out.println("Nhập năm sinh của sinh viên thứ hai: ");
//        int year1 = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Nhập tên sinh viên thứ ba: ");
//        String name2 = sc.nextLine();
//        System.out.println("Nhập năm sinh của sinh viên thứ ba: ");
//        int year2 = Integer.parseInt(sc.nextLine());
//
//        String tenTreNhat = name;
//        int yearTreNhat = year;
//
//        if(year1 > yearTreNhat){
//            tenTreNhat = name1;
//            yearTreNhat = year1;
//        }
//        if(year2 > yearTreNhat){
//            tenTreNhat = name2;
//            yearTreNhat = year2;
//        }
//        System.out.println("Sinh viên trẻ nhất là: "+tenTreNhat + " có năm sinh: "+yearTreNhat);

        // bài 7: Cho 3 số nguyên. Hãy viết chương trình xuất ra có bao nhiêu số lẻ và bao nhiêu số
        //chẵn.
//        System.out.println("Nhập a: ");
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập b: ");
//        int b = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập c: ");
//        int c = Integer.parseInt(sc.nextLine());
//        int demChan = 0;
//        int demLe = 0;
//        if(a % 2 == 0){
//            demChan ++;
//        }else{
//            demLe++;
//        }
//        if(b % 2 == 0){
//            demChan ++;
//        }else{
//            demLe++;
//        }
//        if(c % 2 == 0){
//            demChan ++;
//        }else{
//            demLe++;
//        }
//        System.out.println("Tổng số chẳn: "+demChan);
//        System.out.println("Tổng số lẻ: "+demLe);

        // bài 8: Cho biết tên, năm sinh và giới tính của 3 cán bộ. Hãy viết chương trình tìm và in tên
        //cán bộ Nam trẻ nhất.
            // thông tin cán bộ 1
//            System.out.println("Nhập vào tên cán bộ thứ nhất: ");
//            String canBo1 = sc.nextLine();
//            System.out.println("Nhập năm sinh cán bộ thứ nhất: ");
//            int namSinh1 = Integer.parseInt(sc.nextLine());
//            System.out.println("Nhập giới tính cán bộ thứ nhất: ");
//            String gioiTinh1 = sc.nextLine();
//            // thông tin cán bộ 2
//            System.out.println("Nhập vào tên cán bộ thứ hai: ");
//            String canBo2 = sc.nextLine();
//            System.out.println("Nhập năm sinh cán bộ thứ hai: ");
//            int namSinh2 = Integer.parseInt(sc.nextLine());
//            System.out.println("Nhập giới tính cán bộ thứ hai: ");
//            String gioiTinh2 = sc.nextLine();
//            // thông tin cán bộ 3
//            System.out.println("Nhập vào tên cán bộ thứ ba: ");
//            String canBo3 = sc.nextLine();
//            System.out.println("Nhập năm sinh cán bộ thứ ba: ");
//            int namSinh3 = Integer.parseInt(sc.nextLine());
//            System.out.println("Nhập giới tính cán bộ thứ ba: ");
//            String gioiTinh3 = sc.nextLine();
//
//            String canBoTreNhat = canBo1;
//            int namSinhTreNhat = namSinh1;
//            String gioiTinh = gioiTinh1;
//
//            if(namSinh2 > namSinhTreNhat){
//                canBoTreNhat = canBo2;
//                namSinhTreNhat = namSinh2;
//                gioiTinh = gioiTinh2;
//            }
//            if(namSinh3 > namSinhTreNhat){
//                canBoTreNhat = canBo3;
//                namSinhTreNhat =namSinh3;
//                gioiTinh = gioiTinh3;
//            }
//            System.out.println("Tên cán bộ trẻ nhất là: "+canBoTreNhat+" giới tính là: "+gioiTinh+" có năm sinh: "+namSinhTreNhat);

        // bài 9:Viết chương trình nhập vào thông tin tiêu thụ điện (Tên, số Kw)
        //Tính và xuất Tiền trả theo quy tắc:
        //• 50kw đầu : 500d/kw X = 45 (x<=50) -> x* 500
        //• 50kw kế: 650d/kw X (50-100) -> 50* 500 + (x- 50)* 650
        //• 100kw Kế : 850d/kw x(100-200) -> 50* 500 + 50* 650 + (x-100) * 850
        //• 150kw kế : 1100d/kw x(200-350) -> 50* 500 + 50* 650 + 100 * 850 +
        //(x-200)* 1100
        //• Còn lại : 1300d/kw x> 350 -->

        System.out.println("Nhập tên khách hàng: ");
        String tenKhachHang = sc.nextLine();
        System.out.println("Nhâp số điện đã tiêu thụ(Kw): ");
        int kwTieuThu = Integer.parseInt(sc.nextLine());
        int tien = 0;
        if(kwTieuThu <= 50 ){
            tien = kwTieuThu * 500;
        }else if(kwTieuThu > 50 && kwTieuThu <= 100){
            tien = 50 * 500 + (kwTieuThu - 50) * 650;
        }else if(kwTieuThu > 100 && kwTieuThu <= 200){
            tien = 50 * 500 + 50  * 650 + (kwTieuThu - 100) * 850;
        } else if (kwTieuThu > 200 && kwTieuThu <= 350) {
            tien = 50 * 500 + 50 * 650+ 100* 850+(kwTieuThu - 200) * 1100;
        }else{
            tien = 50 * 500 + 50 * 650+ 100* 850+150*1100+(kwTieuThu - 350) * 1300;
        }
        System.out.println("Tên khách hàng là: "+tenKhachHang);
        System.out.println("Số tiền phải trả là: "+tien);


    }
}
