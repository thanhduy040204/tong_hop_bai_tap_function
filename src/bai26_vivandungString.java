import java.util.Scanner;

public class bai26_vivandungString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            nhap vao 1 chuoi tu ban phim,
            dem xem co bao nhieu ky tu thuong
            bao nhiu in hoa
            bao nhiu so
            bao nhiu space
         */
        int kyTuThuong =0;
        int kyTuHoa =0;
        int demSo=0;
        int khoangTrang = 0;

        System.out.println("Moi ban nhap 1 chuoi: ");
        String chuoi = sc.nextLine();
        System.out.println(chuoi.length());
        for(int i = 0; i<chuoi.length(); i++){
            char c = chuoi.charAt(i);
            if(Character.isLowerCase(c)){
                kyTuThuong++;
            } else if (Character.isUpperCase(c)) {
                kyTuHoa++;
            } else if (Character.isDigit(c)) {
                demSo++;
            } else if (Character.isWhitespace(c)) {
                khoangTrang++;
            }
        }
        System.out.println("ky tu thuong la: "+kyTuThuong);
        System.out.println("ky tu viet hoa la: "+kyTuHoa);
        System.out.println("Ky tu so: "+demSo);
        System.out.println("ky tu khoang trang: "+khoangTrang);
    }
}
