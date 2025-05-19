import java.util.Scanner;

public class bai11_java08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập c: ");
        double c = Double.parseDouble(sc.nextLine());
        double delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if(delta == 0){
            double x = -b / (2*a);
            System.out.println("Phương trình có nghiệm kép "+x);
        }else if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }

    }
}
