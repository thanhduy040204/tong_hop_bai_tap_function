public class bai26_5_stringGIAIBAITAP19 {
    public static void main(String[] args) {
        String s1="English = 78 Science = 83 Math = 68 History = 65";

        //78+83+68+65 = 294
        //trung binh cong = 73,5
        int sum=0;
        int count=0;
        String[] parts = s1.split(" ");
        for(String part:parts){
            System.out.println(part);
            try{
                int num = Integer.parseInt(part);
                sum+=num;
                count++;
            }catch (NumberFormatException e){

            }

        }
        double tbc =(double) sum/count;
        System.out.println("Tong cac so tren la: "+sum);
        System.out.println("Trung binh cong cua cac so tren la: "+tbc);

    }
}
