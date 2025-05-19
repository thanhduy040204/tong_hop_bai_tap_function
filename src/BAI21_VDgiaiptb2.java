import java.util.Scanner;

public class BAI21_VDgiaiptb2 {
    public static void main(String[] args) {
        String kq = GiaiPTB2(1,2,3);
        String kq2 = GiaiPTB2(1,2,1);
        String kq3 = GiaiPTB2(1,2,-3);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);
        //nâng cao hơn bằng cách cho người dùng nhập
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập y: ");
        double y = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập z: ");
        double z = Double.parseDouble(sc.nextLine());
        String kq4 = GiaiPTB2(x,y,z);
        System.out.println(kq4);
    }
    public static String GiaiPTB2(double a,double b, double c){
        // nếu a = 0 thì phương trinh trở thành ptb1 bx+c=0
        if(a ==0){
            if(b == 0 && c==0){
                return "Phuong trinh co vo so nghiem";
            }
            else if(b==0 && c != 0){
                return "Phuong trinh bac nhat vo nghiem";
            }
            else
                return "Phuong trinh co nghiem: " +(-c/b);
        }
        else{
            double delta = (b*b)-(4*a*c);
            if(delta <0){
                return "Phuong trinh bac 2 vo nghiem";
            }
            else if(delta == 0){
                double x = (-b)/(2*a);
                return "Phuong trinh bac 2 có nghiem kep: " +x;
            }
            else{
                double x1 = (-b+Math.sqrt(delta))/(2*a);
                double x2 = (-b-Math.sqrt(delta))/(2*a);
                return "Phuong trinh co 2 nghiem phan biet: x1= "+x1+", x2= "+x2;
            }
        }
    }
}
