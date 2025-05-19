import java.util.Scanner;

public class bai11_java06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm dương lịch: ");
        int nam = Integer.parseInt(sc.nextLine());
        if((nam % 4 ==0 && nam%100!=0) || (nam%400 == 0)){
            System.out.println(nam + " là năm nhuận");
        }else{
            System.out.println(nam + " là năm không nhuận");
        }
    }
}
