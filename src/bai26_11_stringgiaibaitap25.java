import java.util.Scanner;

public class bai26_11_stringgiaibaitap25 {
    public static void main(String[] args) {
        /*
        viet chuong trinh ktra 1 chuoi nhap vao tu ban phim co phai la Panyndrome
        (la chuoi dao nguoc bang chinh no, vi duu: madam, radar)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao mot chuo: ");
        String str = sc.nextLine();
        String chuoiDao = new StringBuilder(str).reverse().toString();
        //so sanh chuoi voi chuoi dao
        if(str.equalsIgnoreCase(chuoiDao)){
            System.out.println("day la chuoi Panlyndrome.");
        }
        else{
            System.out.println("day la chuoi Panlyndrome.");
        }
    }
}
