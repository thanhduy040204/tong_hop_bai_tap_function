public class bai17_java17 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        for(int i =1;i<1000;i++){

            for(int j =1;j<i;j++){
                if(i%j==0){
                    tong+=j;
                }
            }
            if(tong==i){
                System.out.println(i + " ");
            }
        }

    }
}
