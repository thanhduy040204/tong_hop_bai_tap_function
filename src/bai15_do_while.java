public class bai15_do_while {
    public static void main(String[] args) {
        int a = 1;
        int tong = 0;
        do{
            tong += a;
            a++;
        }while(a<=5);
        System.out.println("Tong: " + tong);
    }
}
