import java.util.Scanner;

public class bai17_java12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       /*
             System.out.println("Mời nhập vào so nguyen n: ");
             int n = sc.nextInt();
             int gt = 1;
             for(int i = 1;i<=n;i++){
             gt = gt*i;
             System.out.println("Tổng giai thừa là: " +gt);
        }
        */
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        int gt =1;
        int i =1;
        while(i<=n){
           gt = gt*i;
           i++;
        }
        System.out.println("Tong giai thua la: " +gt);






    }
}
