import java.util.Scanner;

public class bai11_java09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int thang = Integer.parseInt(sc.nextLine());
        if(thang == 1 || thang == 2 || thang == 3){
            System.out.println("thang "+thang+ " thuộc quý 1");
        }else if(thang == 4 || thang == 5 || thang == 6){
            System.out.println("thang "+thang+ " thuộc quý 2");
        }else if(thang == 7 || thang == 8 || thang == 9){
            System.out.println("thang "+thang+ " thuộc quý 3");
        }else if(thang == 10 || thang == 11 || thang == 12){
            System.out.println("thang "+thang+ " thuộc quý 4");
        }else{
            System.out.println("Vui lòng nhập đúng tháng");
        }

    }
}
