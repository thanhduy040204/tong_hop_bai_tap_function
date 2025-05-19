public class bai17_java16 {
    public static void main(String[] args) {
        int n = 10;
        int tong = 0;
        int gt = 1;
        for(int i = 1; i<= n;i++){
            gt*=i;
            tong+=gt;
        }
        System.out.println("1! + 2! + 3! + ... + 10! = "+tong);
    }
}
