import java.util.Random;

public class bai24_random {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng ngẫu nhiên
        Random random = new Random();
        //1. Lấy ngẫu nhiên một số nguyên
        int soNguyen= random.nextInt(-50,51);// chạy từ -50 đến 50
        System.out.println(soNguyen);
        //2. lấy ngẫu nhiên một số thưc
        double x = random.nextDouble();
        System.out.println(x);
    }
}
