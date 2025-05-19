import java.util.Scanner;

public class bai17_java13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số từ bàn phím: ");
        int so = Integer.parseInt(sc.nextLine());
        int tong=0;
        if(so%2==0){
            for(int i=0;i<=so;i+=2){
                tong+=i;
            }
            System.out.println("So "+so+" là số chẵn");
            System.out.println("Tổng các số từ 0 đến "+so+" là: "+tong);
        }else
            System.out.println("Tôi không tính số lẻ, bye bye");


    }
}
