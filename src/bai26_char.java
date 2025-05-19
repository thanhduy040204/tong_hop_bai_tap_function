import java.util.Scanner;

public class bai26_char {
    public static void main(String[] args) {
        //khai báo

        char ch ='a';
        char ch1 = 66; // khởi tạo
        System.out.println(ch1);
        char ch3; //khai báo
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một ký tự: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Ký từ bạn vừa nhập là: "+ch4);


    }
}
