import java.util.Scanner;

public class bai17_java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên: ");
        int n = Integer.parseInt(sc.nextLine());
        int tong = 0;
        if(n%2!=0){
            for(int i = 1; i <= n;i+=2){
                if(i == 3)
                    break;
                tong+=i;
            }
            System.out.println("Tong cac so le: " +tong);
        }

    }
}
