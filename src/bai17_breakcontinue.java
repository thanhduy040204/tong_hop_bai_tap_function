public class bai17_breakcontinue {
    public static void main(String[] args) {
        int tong = 0;
        for(int i = 0; i <= 5; i++){
            if( i == 3){
                continue; // bỏ qua giá trị 3
            }
            else {
                tong += i;
            }
        }
        System.out.println("tong= "+tong);

        //break
        int so = 0;
        while(so <= 5){
            if(so == 3){
                break;
            }
            System.out.println("n= " + so);
            so++;
        }
    }
}
