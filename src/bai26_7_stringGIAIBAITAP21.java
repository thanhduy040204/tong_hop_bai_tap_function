public class bai26_7_stringGIAIBAITAP21 {
    public static void main(String[] args) {
        String a = "tôi chăm học tôi chịu khó tôi đẹp trai";
        String[] words=a.split(" ");
        int count=0;
        for(String tu:words){
            if(tu.equals("tôi")){
                count++;
            }
        }
        System.out.println("từ tôi trong chuỗi a xuất hiện "+count+ " lần");
    }
}
