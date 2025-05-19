public class bai6_epkieudulieu {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        double kq = (double)a/b; // ép kiểu int sang double
        System.out.println("Kết quả: "+kq );

        //ép kiểu hẹp
        int c = 128;
        byte d = (byte)c;
        System.out.println(c);
        System.out.println(d);
    }
}
