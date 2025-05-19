import java.util.Scanner;

public class bai17_java18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("nhap vao so nguyen: ");
            int a = Integer.parseInt(sc.nextLine());
            // check dieu kien
            while(a<=0){
                System.out.println("Nhap lai so nguyen , so nguyen phai lon hon 0");
                a = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Ban da nhap so nguyen la: "+a);
            //kiem tra so nguyen to
            int demUoc = 0;
            for(int i = 1;i<=a;i++){
                if(a%i==0){
                    demUoc++;
                }
            }
            if(demUoc==2){
                System.out.println(a +" la so nguyen to");
            }else{
                System.out.println(a +" khong la so nguyen to");
            }
            System.out.println("Ban co muon thoat khong, bam y de thoat: ");
            String traLoi = sc.nextLine();
            if(traLoi.equals("y") || traLoi.equals("Y")){
                break;
            }
        }
    }
}
