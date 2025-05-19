import java.util.Scanner;

public class bai21_java19 {
    /*
    // Giai cach 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        double a = Double.parseDouble(scan.nextLine());
        System.out.println("Nhap vao b: ");
        double b = Double.parseDouble(scan.nextLine());
        System.out.println("Vui long nhap phep tinh(+,-,*,/): ");
        String phep = scan.nextLine();
        if(phep.equals("+")){
            System.out.println("Ket qua: "+Cong(a,b));
        }
        else if(phep.equals("-")){
            System.out.println("Ket qua: "+Tru(a,b));
        }
        else if(phep.equals("*")){
            System.out.println("Ket qua: "+Nhan(a,b));
        }
        else if ( phep.equals("/")) {
            if(b==0){
                System.out.println("Khong co chia cho 0");
                return;
            }
            System.out.println("Ket qua: "+Chia(a,b));
        }
        else
            System.out.println("Khong co phep tinh nay");


    }
    public static double Cong(double a, double b){
        return a+b;
    }
    public static double Tru(double a, double b){
        return a-b;
    }
    public static double Nhan(double a, double b){
        return a*b;
    }
    public static double Chia(double a, double b){
        return a/b;
    }
     */
    //giai cach 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = Double.parseDouble(scan.nextLine());
        System.out.println("Nhap b: ");
        double b = Double.parseDouble(scan.nextLine());
        System.out.println("Nhap phep tinh(+,-,*,/): ");
        String phep = scan.nextLine();
        switch(phep){
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
            default:
                System.out.println("Khong co phep tinh nay");
        }

    }
    public static void cong(double a, double b){
        double kq = a+b;
        System.out.println("Ket qua: "+kq);
    }
    public static void tru(double a, double b){
        double kq = a-b;
        System.out.println("Ket qua: "+kq);
    }
    public static void nhan(double a, double b){
        double kq = a*b;
        System.out.println("Ket qua: "+kq);
    }
    public static void chia(double a, double b){
        if(b==0){
            System.out.println("Khong the chia cho 0");
        }
        else{
            double kq = a/b;
            System.out.println("Ket qua: "+kq);
        }

    }

}
